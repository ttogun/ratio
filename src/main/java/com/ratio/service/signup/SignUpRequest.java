package com.ratio.service.signup;

import java.util.Date;

/**
 * Created by user on 9/14/14.
 */
public class SignUpRequest {
    private String email;
    private String password;
    private String gender;
    private Date dob;

    public SignUpRequest() {
    }

    private SignUpRequest(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.gender = builder.gender;
        this.dob = builder.dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public static class Builder {
        private String email;
        private String password;
        private Date dob;
        private String gender;

        public Builder email(String email){
            this.email = email;
            return this;
        }


        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder dob(Date dob) {
            this.dob = dob;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }


        public SignUpRequest build() {
            return new SignUpRequest(this);
        }
    }
}
