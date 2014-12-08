package com.ratio.access;

import com.ratio.model.User;

/**
 * Created by user on 10/12/14.
 */
public interface UserAccess {
    //1. Get User Info
    User getUserByEmail(String email);

    boolean addUser(User user);

    boolean deleteUser(User user);

    boolean updateUserInfo(User user);
}
