package com.covidshield.model;

import javax.persistence.*;

@Entity
@Table(name = "userdata")
public class UserData {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name ="address")
    private String address;
    @Column(name = "last_name")
    private  String phoneNumber;
    @Column(name= "state")
    private String state;
    @Column(name= "city")
    private String city;
    @Column(name="oxygenavilable")
    private boolean oxygenAvailability;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOxygenAvailability() {
        return oxygenAvailability;
    }

    public void setOxygenAvailability(boolean oxygenAvailability) {
        this.oxygenAvailability = oxygenAvailability;
    }
}
