package com.recipemanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection conn = db.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
            	HttpSession session=request.getSession();
            	session.setAttribute("username", username);
            	if(username.equals("admin"))
            	{
            		response.sendRedirect("admin.jsp");
            	}
            	else {
            		response.sendRedirect("home.jsp");
            	}
            } else {
                response.sendRedirect("login.jsp?error=Ivalid Username or Password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}