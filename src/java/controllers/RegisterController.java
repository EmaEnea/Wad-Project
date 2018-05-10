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
import util.Movie;
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
                         //to be added into a MovieController
                         if(!checker.movieExists("Gravity")){////aici  va fii numele din input
                            Movie mo6 = new Movie();
                            mo6.setName("Gravity");mo6.setGenre("SF");mo6.setChannel("Paramount");
                            mo6.setHour("4 PM");mo6.setDate("11-08-2018");
                            mo6.setOscar(true);mo6.setRating(7.8);

                            em.persist(mo6);
                         }
                         if(!checker.movieExists("Titanic")){
                            Movie mo1 = new Movie();
                            mo1.setName("Titanic");mo1.setGenre("Drama,Romance");mo1.setChannel("ProTV");
                            mo1.setHour("1 PM");mo1.setDate("12-08-2018");
                            mo1.setOscar(true);mo1.setRating(7.8);

                            em.persist(mo1);
                         }
                          if(!checker.movieExists("Avatar")){
                            Movie mo5 = new Movie();
                            mo5.setName("Avatar");mo5.setGenre("Adventure,Fantasy");mo5.setChannel("ProTV");
                            mo5.setHour("7 PM");mo5.setDate("12-08-2018");
                            mo5.setOscar(true);mo5.setRating(7.8);

                            em.persist(mo5);
                         }
                         if(!checker.movieExists("Scream")){
                            Movie mo2 = new Movie();
                            mo2.setName("Scream");mo2.setGenre("Horror");mo2.setChannel("TNT");
                            mo2.setHour("10 PM");mo2.setDate("15-08-2018");
                            mo2.setOscar(false);mo2.setRating(7.2);

                            em.persist(mo2);
                         }   
                         if(!checker.movieExists("Ace Ventura Pet Detective")){
                            Movie mo3 = new Movie();
                            mo3.setName("Ace Ventura Pet Detective");mo3.setGenre("Comedy");mo3.setChannel("PrimaTV");
                            mo3.setHour("5 PM");mo3.setDate("13-08-2018");
                            mo3.setOscar(false);mo3.setRating(6.9);

                            em.persist(mo3);
                         }
                         if(!checker.movieExists("Gladiator")){
                            Movie mo4 = new Movie();
                            mo4.setName("Gladiator");mo4.setGenre("Action,Drama");mo4.setChannel("Antena1");
                            mo4.setHour("11 PM");mo4.setDate("10-08-2018");
                            mo4.setOscar(true);mo4.setRating(8.5);

                            em.persist(mo4);
                         }
                             
                        
                        ////// 
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
