package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import util.Movie;

public class UserDAO {

    private static MovieDAO instance;

    public static MovieDAO getInstance() {
        if (instance == null) {
            instance = new MovieDAO();
        }
        return instance;
    }

    public UserDAO() {
    }

    public String getGenres(String user) throws SQLException{
        java.sql.Statement instr = DBConnection.getConnection().createStatement();
        String sql = "SELECT  * FROM tvguide.user WHERE username='"+user+"'";
        ResultSet rs = instr.executeQuery(sql);
        rs.next();
        if (rs.getString("genre")!=null) return rs.getString("genre");
        else return "";
    }

}
