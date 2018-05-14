package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.User;
import util.Check;
import util.Movie;

public class RegisterController extends HttpServlet {

    @PersistenceContext(unitName = "TvGuidePU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Check checker = new Check();
            User u = new User();
            utx.begin();
            if (checker.userExists(request.getParameter("uname"))) {
                request.getRequestDispatcher("Register.jsp").forward(request, response);
            } else {
                u.setName(request.getParameter("name"));
                u.setUsername(request.getParameter("uname"));
                u.setPassword(request.getParameter("password"));
                u.setEmail(request.getParameter("email"));
                u.setGenre("");
                String adminPass = "";

                if (request.getParameterMap().size() == 6) {
                    u.setAdmin(true);
                    adminPass = request.getParameter("adpass");
                    if (request.getParameter("admin").equals("on") && adminPass.equals("ceparola")) {
                        em.persist(u);
                        utx.commit();
                        request.getRequestDispatcher("Login.jsp").forward(request, response);
                    } else if (request.getParameter("admin").equals("on") && !adminPass.equals("ceparola")) {
                        request.getRequestDispatcher("Register.jsp").forward(request, response);
                    }
                } else {
                    u.setAdmin(false);
                    em.persist(u);
                    utx.commit();
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                }
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    public void persist(Object object) {
    }

}
