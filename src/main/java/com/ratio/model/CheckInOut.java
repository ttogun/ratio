package com.ratio.model;

import java.util.Date;

/**
 * Created by tat26 on 4/8/2014.
 */
public class CheckInOut {
    private int checkInOutId;
    private Location location;
    private User user;
    private Date checkInTime;
    private Date checkoutTime;

    public int getCheckInOutId() {
        return checkInOutId;
    }

    public void setCheckInOutId(int checkInOutId) {
        this.checkInOutId = checkInOutId;
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

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }
}
