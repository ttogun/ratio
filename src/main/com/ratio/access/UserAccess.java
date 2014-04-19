package main.com.ratio.access;

import com.sun.tools.javac.resources.compiler;
import main.com.ratio.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tat26 on 4/8/2014.
 */
public class UserAccess {
    private DataSource dataSource;

    public UserAccess(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //1. Get User Info
    public User getUserByEmail(String email) {
        try {
            Connection connection = dataSource.getConnection();
            ResultSet rs = null;
            String statement = "Select * from user where email = ?";
            PreparedStatement ps = connection.prepareStatement(statement);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addUser(User user) {
        return true;
    }

    public boolean deleteUser(User user) {
        return false;
    }

    public boolean updateUserInfo(User user) {
        return false;
    }
}
