<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Application</title>
 <link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<header>
<h2>Distributor Application</h2>
        <nav>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#services">Services</a></li>
                <li><a href="#contact">Contact</a></li>
                <li><a href="login">Login</a></li>
            </ul>
        </nav>
    </header>
	
	
	<div class="login-container" id="form">
        <form class="login-form" name="frm" action="valid" method="GET">
            <h2>Login</h2>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" value="" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="text" id="password" name="password" value="" required>
            </div>
            <button type="submit" name="s" value="Login">Login</button>
        </form>
    </div>
	
	

</body>
</html>