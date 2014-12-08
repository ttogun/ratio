package com.ratio.model;

import java.util.Date;

/**
 * Created by tat26 on 4/8/2014.
 */
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private String city;
    private String zipCode;
    private String gender;

    private User(
            int userId,
            String firstName,
            String lastName,
            String email,
            Date dob,
            String city,
            String zipCode,
            String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return email;
    }

    public static class Builder {
        private int userId;
        private String firstName;
        private String lastName;
        private String email;
        private Date dob;
        private String city;
        private String zipCode;
        private String gender;

        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dob(Date dob) {
            this.dob = dob;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(userId, firstName, lastName, email, dob, city, zipCode, gender);
        }
    }
}
