package com.recipemanagement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");

        try (Connection conn = db.getConnection()) {
            String sql = "";
            PreparedStatement stmt=null;
            if(query==null) {
            	sql="SELECT * FROM 	recipes order by rid desc";
                stmt= conn.prepareStatement(sql);
            }
            else {
            	sql="SELECT * FROM recipes WHERE approve='Y' and (recipe_name LIKE ? OR ingredients LIKE ?) limit 8";
            	stmt = conn.prepareStatement(sql);
                stmt.setString(1, "%" + query + "%");
                stmt.setString(2, "%" + query + "%");
            }

            ResultSet rs = stmt.executeQuery();

            List<Recipe> recipes = new ArrayList<>();
            while (rs.next()) {
                Recipe recipe = new Recipe();
                recipe.setRid(rs.getInt("rid"));
                recipe.setRecipeName(rs.getString("recipe_name"));
                recipe.setIngredients(rs.getString("ingredients"));
                recipe.setProcess(rs.getString("process"));
                recipe.setImageUrl(rs.getString("image_url"));
                recipe.setUsername(rs.getString("username"));
                recipe.setApprove(rs.getString("approve"));
                recipes.add(recipe);
            }

            response.setContentType("application/json");
            response.getWriter().write(new Gson().toJson(recipes));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}