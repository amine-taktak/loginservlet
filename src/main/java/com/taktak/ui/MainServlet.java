package com.taktak.ui;

import com.taktak.businesslogic.UserData;
import com.taktak.businesslogic.value.UserBO;

import javax.inject.Inject;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Inject
    private UserData userData;

    private static final String USERNAME = "username";

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {


        UserBO userBO = userData.getUserData(request.getParameter(USERNAME));

        if (userBO != null) {

            PrintWriter writer = response.getWriter();
            writer.write("<!DOCTYPE html>");
            writer.write("<html lang=\"en\">");
            writer.write("<head>" +
                                    "<style>" +
                                        "h1 {text-align: center;} " +
                                        "table, th, td {border: 1px solid black};}"+
                                     "</style>" +
                                     "<title>main</title>" +
                            "</head>");
            writer.write("<body>" +
                                 "<h1>User "+ userBO.getUsername()+"</h1>"+
                                 "<h2> Personal Data</h2>"+
                                 "<table style=\"width:70%\">"+
                                    "<tr>" +
                                        "<th>firstname</th>" +
                                        "<th>lastname</th>" +
                                     "</tr>"+
                                     "<tr>" +
                                       "<td>"+userBO.getFirstname()+"</td>" +
                                       "<td>"+userBO.getLastname()+"</td>" +
                                      "</tr>"+
                                  "</table>" +
                             "</body>");
            writer.write("</html>");
            writer.close();
        }
    }
}
