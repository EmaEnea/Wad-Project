package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Check;

public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Check checker = new Check();
            List<String> errors = new ArrayList<>();
            String user = request.getParameter("uname");
            String pass = request.getParameter("password");

            if (checker.userExists2(user, pass) == false) {
                errors.add("Invalid user or password");
                request.setAttribute("errors", errors);
                System.out.println("Error added");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            } else {
                request.setAttribute("users", user);
                request.getSession().setAttribute("users", user);
                if (checker.isAdmin(user)) {
                    request.setAttribute("admin","1");
                    request.getSession().setAttribute("admin","1");
                    request.getRequestDispatcher("AdminProfile.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("Profile.jsp").forward(request, response);
                }
            }
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
