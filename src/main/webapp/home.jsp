<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body onload="searchRecipes()" style="background-image:url('images/body2.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">

<%@include file="banner.jsp" %>
	<br>
	<br>
    <div class="container">
        <input type="text" id="search" placeholder="Search recipes...">
        <button onclick="searchRecipes()">Search</button>
        <button onclick="window.location.href='addRecipe.jsp'">Add Recipe</button>
        <div id="recipes"></div>
    </div>
    <script src="js/script.js"></script>
     
				
    

</body>
</html>