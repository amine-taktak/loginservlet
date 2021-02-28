<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="styles/login.css"/>
</head>
<body>

<div class="login">
    <p>Login Page</p>
    <form method="post" action="login">
        <div class="error">
            <%
                if (request.getAttribute("errorMessage") != null) {
                    out.println(request.getAttribute("errorMessage"));
                }
            %>
         </div>
        <div>
            <label for="uname" class="label">Username</label>
            <input id ="uname" type="text" name="username" placeholder="Enter Username"/>
        </div>
        <div>
            <label for="pwd" class="label">Password</label>
            <input id="pwd" type="text" name="password" placeholder="Enter Password"/>
        </div>
        <div class="submit" id="submit">
          <input type="submit" value="login"/>
        </div>
    </form>
</div>
</body>
</html>