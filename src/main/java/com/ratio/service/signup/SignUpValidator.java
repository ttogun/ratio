package com.ratio.service.signup;

import com.ratio.service.Validator;
import com.ratio.service.signup.SignUpRequest;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Date;

/**
 * Created by user on 9/14/14.
 */
public class SignUpValidator implements Validator<SignUpRequest> {
    @Override
    public void validate(SignUpRequest input) {
        if(input == null) {
            throw new IllegalArgumentException("SignUpRequest cannot be null");
        }

        validateEmail(input.getEmail());
        validateDoB(input.getDob());
    }

    private void validateDoB(Date dob) {

    }

    private void validateEmail(String email) {
        if(email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }

        try {
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
        } catch (AddressException e) {
            throw new IllegalArgumentException("email address not valid");
        }
    }
}
