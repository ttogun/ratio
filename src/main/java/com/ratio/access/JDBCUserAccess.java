package com.ratio.access;

import com.ratio.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tat26 on 4/8/2014.
 */
public class JDBCUserAccess implements UserAccess {
    private DataSource dataSource;

    public JDBCUserAccess(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //1. Get User Info
     @Override
     public User getUserByEmail(String email) {
        try {
            Connection connection = dataSource.getConnection();
            ResultSet rs = null;
            String statement = "Select * from user where email = ?";
            PreparedStatement ps = connection.prepareStatement(statement);
            ps.setString(1, email);
            rs = ps.executeQuery();

            User user = null;
            if(rs.next()) {
                user = new User.Builder()
                        .city(rs.getString("city"))
                        .email(rs.getString("email"))
                        .dob(rs.getDate("dob"))
                        .gender(rs.getString("gender"))
                        .firstName(rs.getString("firstName"))
                        .lastName(rs.getString("lastName"))
                        .zipCode(rs.getString("zipCode"))
                        .userId(rs.getInt("userId"))
                        .build();
            }

            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addUser(User user) {
        return true;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public boolean updateUserInfo(User user) {
        return false;
    }
}
