package util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private boolean administrator;
    private String genre;
    private String movies;

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setGenre(String gen) {
        this.genre = gen;
    }

    public void setAdmin(boolean x) {
        this.administrator = x;
    }

    public void setPassword(String password) {
        this.password = getHash(password);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }
    
    public String getGenre() {
        return genre;
    }

    public boolean getAdmin() {
        return administrator;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "util.User[ id=" + id + " ]";
    }
    
}
