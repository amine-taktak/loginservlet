package com.taktak.ui;

import com.taktak.businesslogic.UserData;
import com.taktak.businesslogic.value.UserBO;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Inject
    private UserData userData;

    private static final String USERNAME = "username";

    private static final String MAIN_PAGE_JSP = "MainPage.jsp";

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {


        UserBO currentUser = userData.getUserData(request.getParameter(USERNAME));

        if (currentUser != null) {

            String username  = currentUser.getUsername();
            request.setAttribute("username", username);

            String firstname = currentUser.getFirstname();
            request.setAttribute("firstname", firstname);

            String lastname  = currentUser.getLastname();
            request.setAttribute("lastname", lastname);

            RequestDispatcher rd = request.getRequestDispatcher(MAIN_PAGE_JSP);
            rd.forward(request, response);
        }
    }
}
