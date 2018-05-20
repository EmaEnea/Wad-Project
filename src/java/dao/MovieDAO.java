package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import util.Movie;

public class MovieDAO {

    private static MovieDAO instance;

    public static MovieDAO getInstance() {
        if (instance == null) {
            instance = new MovieDAO();
        }
        return instance;
    }

    public MovieDAO() {
    }

    public List<util.Movie> getMovies() throws SQLException {
        List<util.Movie> movies = new ArrayList<>();
        java.sql.Statement instr = DBConnection.getConnection().createStatement();
        String sql = "SELECT  * FROM tvguide.movie ORDER BY rating DESC";
        ResultSet rs = instr.executeQuery(sql);
        while (rs.next()) {
            Movie m = new Movie();
            m.setChannel(rs.getString("channel"));
            m.setDate(rs.getString("dates"));
            m.setGenre(rs.getString("genre"));
            m.setHour(rs.getString("hours"));
            m.setId(rs.getLong("id"));
            m.setName(rs.getString("name"));
            m.setOscar(rs.getBoolean("oscar"));
            m.setReview(rs.getString("review"));
            m.setImage(rs.getString("image"));
            m.setRating(rs.getDouble("rating"));
            m.setReview(rs.getString("review"));
            movies.add(m);
        }
        return movies;
    }

    
    public List<util.Movie> getRecomMovies(String preferred, String user) throws SQLException, ClassNotFoundException {
        String[] pref = preferred.split(" ");
        List<util.Movie> movies = new ArrayList<>();
        java.sql.Statement instr = DBConnection.getConnection().createStatement();
        String sql = "SELECT  * FROM tvguide.movie ORDER BY rating DESC";
        ResultSet rs = instr.executeQuery(sql);
        while (rs.next()) {
            String genres = rs.getString("genre");
            String[] genreSeparated = genres.split(",");
            for (int i = 1; i < pref.length; i++) {
                for (int j = 0; j < genreSeparated.length; j++) {
                    if (pref[i].equals(genreSeparated[j])) {
                        Movie m = new Movie();
                        m.setChannel(rs.getString("channel"));
                        m.setDate(rs.getString("dates"));
                        m.setGenre(genres);
                        m.setHour(rs.getString("hours"));
                        m.setId(rs.getLong("id"));
                        m.setName(rs.getString("name"));
                        m.setOscar(rs.getBoolean("oscar"));
                        m.setReview(rs.getString("review"));
                        m.setImage(rs.getString("image"));
                        m.setRating(rs.getDouble("rating"));
                        movies.add(m);
                        i = pref.length - 1;
                    }
                }
            }
        }
        return movies;
    }

}
