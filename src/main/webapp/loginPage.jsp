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
            <label class="label" for="uname">Username</label>
            <input type="text" placeholder="Enter Username" name="username"/>
        </div>
        <div>
            <label class="label" for="pwd">Password</label>
            <input type="text" placeholder="Enter Password" name="password"/>
        </div>
        <div class="submit" id="submit">
          <input type="submit" value="login"/>
        </div>
    </form>
</div>
</body>
</html>