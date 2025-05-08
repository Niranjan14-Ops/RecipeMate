<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body style="background-image:url('images/body2.jpg');background-position:center;background-repeat:no-repeat;background-size:cover;">
    <div class="formcontainer">
        <h1>Sign Up</h1>
        <form action="register" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Sign Up</button>
        </form>
        <p>Already have an account? <a href="login.jsp">Login</a></p>
        <font color="red" size="4">${param.error}</font>
    </div>
</body>
</html>