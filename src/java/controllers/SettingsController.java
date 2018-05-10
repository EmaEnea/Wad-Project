package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SettingsController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        util.Check add = new util.Check();
        String genres = "";
        String user = (String) request.getSession().getAttribute("users");
        String drama = request.getParameter("drama");
        if (drama != null) {
            genres += " Drama";
        }
        String romance = request.getParameter("romance");
        if (romance != null) {
            genres += " Romance";
        }
        String sf = request.getParameter("SF");
        if (sf != null) {
            genres += " SF";
        }
        String act = request.getParameter("action");
        if (act != null) {
            genres += " Action";
        }
        String com = request.getParameter("comedy");
        if (com != null) {
            genres += " Comedy";
        }
        String hor = request.getParameter("horror");
        if (hor != null) {
            genres += " Horror";
        }
        String advent = request.getParameter("advent");
        if (advent != null) {
            genres += " Adventure";
        }
        String fant = request.getParameter("fant");
        if (fant != null) {
            genres += " Fantasy";
        }
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
        add.setGenres(genres, user);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SettingsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
