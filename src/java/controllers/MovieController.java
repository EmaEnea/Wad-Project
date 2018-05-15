package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import util.Check;
import util.Movie;

@WebServlet(name = "MovieController", urlPatterns = {"/MovieController"})
public class MovieController extends HttpServlet {

    @PersistenceContext(unitName = "TvGuidePU")
    private EntityManager em;

    @Resource
    private javax.transaction.UserTransaction utx;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, NotSupportedException, SystemException, RollbackException, HeuristicMixedException, IllegalStateException, SecurityException, HeuristicRollbackException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Check checker = new Check();
            if (!checker.movieExists(request.getParameter("title"))) {
                try {
                    utx.begin();
                    boolean oscar = false;
                    Movie u = new Movie();
                    em.persist(u);
                    u.setName(request.getParameter("title"));
                    u.setGenre(request.getParameter("genre"));
                    u.setChannel(request.getParameter("channel"));
                    u.setHour(request.getParameter("hour"));
                    u.setDate(request.getParameter("date"));
                    u.setImage(request.getParameter("image"));
                    u.setReview(null);
                    u.setOscar(oscar);
                    u.setRating(Double.parseDouble(request.getParameter("rating")));
                    if (!checker.movieExists("Gravity")) {
                        Movie mo6 = new Movie();
                        mo6.setName("Gravity");
                        mo6.setGenre("SF");
                        mo6.setChannel("Paramount");
                        mo6.setReview(null);
                        mo6.setHour("4 PM");
                        mo6.setDate("11-08-2018");
                        mo6.setImage("https://carlosnightman.files.wordpress.com/2016/12/gravity-film-poster.jpg?w=397&h=566");
                        mo6.setOscar(true);
                        mo6.setRating(7.8);
                        em.persist(mo6);
                    }
                    if (!checker.movieExists("Titanic")) {
                        Movie mo1 = new Movie();
                        mo1.setName("Titanic");
                        mo1.setGenre("Drama,Romance");
                        mo1.setChannel("ProTV");
                        mo1.setReview(null);
                        mo1.setHour("1 PM");
                        mo1.setDate("12-08-2018");
                        mo1.setImage("https://images-na.ssl-images-amazon.com/images/I/51G13d3EwBL.jpg");
                        mo1.setOscar(true);
                        mo1.setRating(7.8);
                        em.persist(mo1);
                    }
                    if (!checker.movieExists("Avatar")) {
                        Movie mo5 = new Movie();
                        mo5.setName("Avatar");
                        mo5.setGenre("Adventure,Fantasy");
                        mo5.setChannel("ProTV");
                        mo5.setReview(null);
                        mo5.setHour("7 PM");
                        mo5.setDate("12-08-2018");
                        mo5.setImage("http://www.movieposter.com/posters/archive/main/98/MPW-49434");
                        mo5.setOscar(true);
                        mo5.setRating(7.8);
                        em.persist(mo5);
                    }
                    if (!checker.movieExists("Scream")) {
                        Movie mo2 = new Movie();
                        mo2.setName("Scream");
                        mo2.setGenre("Horror");
                        mo2.setChannel("TNT");
                        mo2.setReview(null);
                        mo2.setHour("10 PM");
                        mo2.setDate("15-08-2018");
                        mo2.setImage("https://vignette.wikia.nocookie.net/scream/images/3/3e/Scream_Ghostface_Poster.jpg/revision/latest?cb=20150724143710");
                        mo2.setOscar(false);
                        mo2.setRating(7.2);
                        em.persist(mo2);
                    }
                    if (!checker.movieExists("Ace Ventura Pet Detective")) {
                        Movie mo3 = new Movie();
                        mo3.setName("Ace Ventura Pet Detective");
                        mo3.setGenre("Comedy");
                        mo3.setChannel("PrimaTV");
                        mo3.setReview(null);
                        mo3.setHour("5 PM");
                        mo3.setDate("13-08-2018");
                        mo3.setImage("https://www.movieposter.com/posters/archive/main/65/MPW-32863");
                        mo3.setOscar(false);
                        mo3.setRating(6.9);
                        em.persist(mo3);
                    }
                    if (!checker.movieExists("Gladiator")) {
                        Movie mo4 = new Movie();
                        mo4.setName("Gladiator");
                        mo4.setGenre("Action,Drama");
                        mo4.setChannel("Antena1");
                        mo4.setReview(null);
                        mo4.setHour("11 PM");
                        mo4.setDate("10-08-2018");
                        mo4.setImage("http://p4.storage.canalblog.com/44/68/663791/57159007_p.jpg");
                        mo4.setOscar(true);
                        mo4.setRating(8.5);
                        em.persist(mo4);
                    }
                    if (request.getParameterMap().size() == 8) {
                        oscar = true;
                        u.setOscar(oscar);
                        em.persist(u);
                        utx.commit();
                    } else {
                        em.persist(u);
                        utx.commit();
                    }
                } catch (Exception e) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
                    throw new RuntimeException(e);
                }
            }
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotSupportedException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SystemException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RollbackException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicMixedException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicRollbackException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotSupportedException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SystemException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RollbackException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicMixedException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicRollbackException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
