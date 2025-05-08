<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body style="background-image:url('images/body2.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
    <div class="formcontainer">
        <h1>Login</h1>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
        <p>Don't have an account? <a href="signup.jsp">Sign Up</a></p>
        <font color="red" size="4">${param.error}</font>
    </div>
    
</body>
</html>