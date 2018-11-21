package com.company;

public class Address {

    private String street;
    private String city;
    private String zip;
    private String country;
    public Address(String street,String city, String zip, String country)
    {
        this.street =street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
@Override
    public String toString()
    {
        return String.format("%1$s, %2$s, %3$s, %4$s",street,city,zip,country ); //convert our strings to a single string address
    }
}
