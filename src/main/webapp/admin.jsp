<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
 <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body onload="adminSearchRecipes()" style="background-image:url('images/body2.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
<%@include file="banner.jsp" %>
<br/>
<br/>

<div class="container">
<table bgColor="white" border="1" width="100%">
		<thead>
			<tr>
				<th>Recipe Name</th>
				<th> Image </th>
				<th>By Username</th>
				<th>Action </th>
			</tr>
		</thead>
      <!--   <button onclick="window.location.href='addRecipe.jsp'">Add Recipe</button> -->
        <tbody id="adminrecipes"></tbody>
	</table>
</div>
    <script src="js/adminscript.js"></script>

</body>
</html>