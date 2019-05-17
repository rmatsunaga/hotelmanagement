package com.reymatsunaga.HotelManagement.model;

public class Address {
    private String city;
    private String country;

    public Address () {}

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

}
