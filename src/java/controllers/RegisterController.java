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

public class RegisterController extends HttpServlet {

    @PersistenceContext(unitName = "TvGuidePU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Check checker = new Check();
            List<String> l = new ArrayList<>();
            Set<String> param = (Set<String>) request.getParameterMap().keySet();
            for (String params : param) {
                l.add(request.getParameter(params));
            }
            utx.begin();
            for (String par : param) {
                String user = request.getParameter(par);
                if ("uname".equals(par)) {
                    if (checker.userExists(user)) {
                        request.getRequestDispatcher("Register.jsp").forward(request, response);
                    } else {
                        User u = new User();
                        u.setName(l.get(0));
                        u.setUsername(l.get(1));
                        u.setPassword(l.get(2));
                        u.setEmail(l.get(3));
                        em.persist(u);
                        utx.commit();
                        request.getRequestDispatcher("Login.jsp").forward(request, response);
                        break;
                    }
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
