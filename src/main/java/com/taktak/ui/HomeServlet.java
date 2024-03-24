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

/**
 * @author Amine Taktak
 * @created 23.05.2020
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Inject
    private UserData userData;

    private static final String USERNAME = "username";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String HOME_PAGE_JSP = "HomePage.jsp";

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {


        UserBO currentUser = userData.getUserData(request.getParameter(USERNAME));

        if (currentUser != null) {

            String username = currentUser.getUsername();
            request.setAttribute(USERNAME, username);

            String firstname = currentUser.getFirstname();
            request.setAttribute(FIRSTNAME, firstname);

            String lastname = currentUser.getLastname();
            request.setAttribute(LASTNAME, lastname);

            RequestDispatcher rd = request.getRequestDispatcher(HOME_PAGE_JSP);
            rd.forward(request, response);
        }
    }
}
