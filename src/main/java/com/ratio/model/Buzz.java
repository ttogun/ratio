package com.ratio.model;

import java.util.Date;

/**
 * Created by tat26 on 4/8/2014.
 */
public class Buzz {
    private int buzzId;
    private Location location;
    private User user;
    private Date buzzTime;
    private int buzzRate;

    public int getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(int buzzId) {
        this.buzzId = buzzId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getBuzzTime() {
        return buzzTime;
    }

    public void setBuzzTime(Date buzzTime) {
        this.buzzTime = buzzTime;
    }

    public int getBuzzRate() {
        return buzzRate;
    }

    public void setBuzzRate(int buzzRate) {
        this.buzzRate = buzzRate;
    }
}
