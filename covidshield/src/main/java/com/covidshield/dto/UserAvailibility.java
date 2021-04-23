package com.covidshield.dto;

import com.covidshield.model.UserData;

public class UserAvailibility {

    private int id;
    private String name;
    private String phoneNUmber;
    private String address;
    private boolean isOxygenAvailable;


   public  UserAvailibility(UserData userData) {
        this.id = userData.getId();
        this.name = userData.getName();
        this.phoneNUmber = userData.getPhoneNumber();
        this.address = userData.getAddress();
        this.isOxygenAvailable = userData.isOxygenAvailability();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOxygenAvailable() {
        return isOxygenAvailable;
    }

    public void setOxygenAvailable(boolean oxygenAvailable) {
        isOxygenAvailable = oxygenAvailable;
    }
}


