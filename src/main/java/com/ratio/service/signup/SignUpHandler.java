package com.ratio.service.signup;

import com.ratio.model.User;

/**
 * Created by user on 9/14/14.
 */
public class SignUpHandler {
    private SignUpValidator validator;
    private SignUpAccess signUpAccess;

    public SignUpHandler(SignUpValidator validator, SignUpAccess signUpAccess) {
        this.validator = validator;
        this.signUpAccess = signUpAccess;
    }

    public SignUpResponse signUp(SignUpRequest details) {
        validator.validate(details);

        User newUser = new User.Builder()
                .email(details.getEmail())
                .dob(details.getDob())
                .gender(details.getGender())
                .build();

        signUpAccess.saveUser(newUser);

        return new SignUpResponse(newUser, "token");
    }
}
