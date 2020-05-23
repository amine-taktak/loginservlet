package com.taktak.ui;

import com.taktak.businesslogic.LoginChecker;
import com.taktak.businesslogic.UserData;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Inject
    private LoginChecker loginchecker;

    @Inject
    private UserData userData;

    private static final long serialVersionUID = 1L;
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String LOGIN_FAILURE_HTML = "loginFailure.html";

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter(USERNAME);
        String pwd = request.getParameter(PASSWORD);

        boolean result = loginchecker.checkLogin(uname, pwd);

        ServletContext servletContext =  request.getSession().getServletContext();

        if (result) {
            RequestDispatcher rd = servletContext.getRequestDispatcher("/main");
            rd.forward(request,response);

        } else {
            response.sendRedirect(LOGIN_FAILURE_HTML);
        }
    }
}
