<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Main Page</title>
        <link rel="stylesheet" type="text/css" type="text/css"  href="styles/main.css">
    </head>

    <body>
        <p>
           You are logged as <%out.println(request.getAttribute("username"));%>

        <p>
        <h2> Personal Data</h2>
        <table>
            <tr>
                <th>firstname</th>
                <th>lastname</th>
            </tr>
            <tr>
                 <td>
                    <%out.println(request.getAttribute("firstname"));%>
                 </td>
                 <td>
                    <%out.println(request.getAttribute("lastname"));%>
                 </td>

            </tr>
        </table>
    </body>
</html>
