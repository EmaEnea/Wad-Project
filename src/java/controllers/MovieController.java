/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
import util.User;

/**
 *
 * @author admin
 */
@WebServlet(name = "MovieController", urlPatterns = {"/MovieController"})
public class MovieController extends HttpServlet {

     @PersistenceContext(unitName = "TvGuidePU")
    private EntityManager em;
    
    @Resource
    private javax.transaction.UserTransaction utx;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, NotSupportedException, SystemException, RollbackException, HeuristicMixedException, IllegalStateException, SecurityException, HeuristicRollbackException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Check checker = new Check();
            
            List<String> l = new ArrayList<>();
            Set<String> param = (Set<String>) request.getParameterMap().keySet();
            out.println(param);
            for (String params : param) {
                l.add(request.getParameter(params));
            }
         
          if(!checker.movieExists(l.get(0))){
              
               try {
                 utx.begin();
                 Movie u = new Movie();
                 boolean oscar=l.get(5).equals("on") ? true : false;
                 u.addMovie(l.get(0), l.get(1), l.get(2), l.get(3), l.get(4), oscar, Double.parseDouble(l.get(6)));
                 em.persist(u);
                 utx.commit();
             } catch (Exception e) {
                 Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
                 throw new RuntimeException(e);
        }
              
           /*   
              
              
              
              utx.begin();
              boolean oscar=l.get(5).equals("on") ? true : false;
              u.addMovie(l.get(0), l.get(1), l.get(2), l.get(3), l.get(4), oscar, Double.parseDouble(l.get(6)));
              em.persist(u);
              utx.commit();*/
          }
          request.getRequestDispatcher("Home.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

  

}
