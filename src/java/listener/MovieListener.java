package listener;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MovieListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        dao.MovieDAO m=new  dao.MovieDAO();
        List<util.Movie> movies;
        try {
            movies = m.getMovies();
            sce.getServletContext().setAttribute("allMovies", movies);
            System.out.println(movies.get(0).getReview());
        } catch (SQLException ex) {
            Logger.getLogger(MovieListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
