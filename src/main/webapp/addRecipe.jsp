<!DOCTYPE html>
<html>
<head>
    <title>Add Recipe</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body style="background-image:url('images/body2.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
    <%@include file="banner.jsp" %>
    <div class="addrecipe">
        <h1>Add Recipe</h1>
        <form action="addRecipe" method="post">
            <input type="text" name="recipeName" placeholder="Recipe Name" required>
            <textarea name="ingredients" rows="7" placeholder="Ingredients" required></textarea>
            <textarea name="process" rows="7" placeholder="Process" required></textarea>
            <input type="text" name="imageUrl" placeholder="Image URL">
            <button type="submit">Add Recipe</button>
        </form>
        <p><a href="home.jsp">Back to Home</a></p>
    </div>
</body>
</html>