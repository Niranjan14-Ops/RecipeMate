package com.recipemanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addRecipe")
public class AddRecipe extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String recipeName = request.getParameter("recipeName");
        String ingredients = request.getParameter("ingredients");
        String process = request.getParameter("process");
        String imageUrl = request.getParameter("imageUrl");

        try (Connection conn = db.getConnection()) {
            String sql = "INSERT INTO recipes (recipe_name, ingredients, process, image_url,username) VALUES (?, ?, ?, ?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, recipeName);
            stmt.setString(2, ingredients);
            stmt.setString(3, process);
            stmt.setString(4, imageUrl);
            HttpSession session=request.getSession();
            String suser=(String)session.getAttribute("username");
            stmt.setString(5, suser);
            stmt.executeUpdate();
            response.sendRedirect("home.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}