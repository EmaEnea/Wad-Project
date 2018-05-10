package util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Check {

    public boolean movieExists(String nameMovie) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
        Connection con = DBConnection.getConnection();
        java.sql.Statement instr = con.createStatement();
        String sql = "SELECT name FROM tvguide.movie WHERE name='" + nameMovie +"'";
        ResultSet rs = instr.executeQuery(sql);
        while (rs.next()) {
            String name = rs.getString(1);
            if (nameMovie.equals(name)) {
                return true;
            }
        }
        return false; 
    }
    public boolean userExists(String user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DBConnection.getConnection();
        java.sql.Statement instr = con.createStatement();
        String sql = "SELECT username FROM tvguide.user WHERE username='" + user +"'";
        ResultSet rs = instr.executeQuery(sql);
        while (rs.next()) {
            String username = rs.getString(1);
            if (user.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean userExists2(String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DBConnection.getConnection();
        java.sql.Statement instr = con.createStatement();
        pass=getHash(pass);
        String sql = "SELECT username,password FROM tvguide.user WHERE username='" + user + "' AND password='" + pass + "'";
        ResultSet rs = instr.executeQuery(sql);
        return rs.next();
    }
    
    public static String getHash(String password) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        digest.reset();
        try {
            digest.update(password.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return new BigInteger(1, digest.digest()).toString(16);
    }
    
    public void setGenres(String genres, String user) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DBConnection.getConnection();
        String sql = "UPDATE tvguide.user SET genres = '"+genres+"' WHERE username='" + user +"'";
        PreparedStatement preparedStmt = con.prepareStatement(sql);
        preparedStmt.executeUpdate();
    }
}
