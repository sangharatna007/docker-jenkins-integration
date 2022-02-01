package com.example.dockerjenkinsintegration.model;

public class Address {
    private String cityname;
    private String state;
    private String country;
    private Integer pin;

    public Address(String cityname, String state, String country, Integer pin) {
        this.cityname = cityname;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
}
