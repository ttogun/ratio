package com.ratio.service.signup;

import com.ratio.model.User;

/**
 * Created by user on 9/14/14.
 */
public class SignUpResponse {
    private User newUser;
    private String token;

    public SignUpResponse(User newUser, String token) {
        this.newUser = newUser;
        this.token = token;
    }

    public User getUser() {
        return newUser;
    }

    public String getToken() {
        return token;
    }
}
