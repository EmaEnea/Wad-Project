package controllers;

import dao.UserDAO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
                    dao.UserDAO u= new UserDAO();
                    dao.MovieDAO m=new  dao.MovieDAO();
                    List<util.Movie> movies=m.getRecomMovies(u.getGenres(user),user);
                    request.getSession().setAttribute("movies", movies);
                    request.getSession().setAttribute("admin",null);
                    SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat sdfDate2 = new SimpleDateFormat("yyyy-MM-dd");
                    String currentDate = sdfDate.format(Calendar.getInstance().getTime());
                    String currentDate2 = sdfDate2.format(Calendar.getInstance().getTime());
                    String[] iter = checker.getUserMovies(request.getSession().getAttribute("users").toString()).split(" ");
                    int i=0;
                    if(!checker.getUserMovies(request.getSession().getAttribute("users").toString()).equals("")){
                       String notifications="";
                       for(String s : iter){
                           if(checker.getDate(s).equals(currentDate) || checker.getDate(s).equals(currentDate2)){
                                 notifications+=" The movie "+s+" is running today at "+checker.getHour(s)+" on "+checker.getChannel(s)+"<br>";
                           }
                            i++;
                        }
                       request.getSession().setAttribute("notifications", notifications);
                    } 
                    else{
                        request.getSession().setAttribute("notifications","");
                    }
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
