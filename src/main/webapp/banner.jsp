	<div class="navbar">
		<a style="font-size:25px;color:white;">RecipeMate</a>
  		<a href="home.jsp">Home</a>
  		
  		<%String user=(String)session.getAttribute("username");
  			if(user.equals("admin")) {
  		%>
  			<a href="admin.jsp">Manage Recipes</a>		
  		<%
  			}
  		%>
   	
  		<a>	<b> Welcome ${sessionScope.username}!! </b></a>
  		<a href="LogoutServlet">Logout</a> 
      	</div>
	</div>
