package com.bus;

import java.util.Date;

public class Trip {
    private String startLoc;
    private String destLoc;
    private String dateOfDep;
    private String timeOfDep;
    private String dateOfArrival;
    private String timeOfArrival;
    private int price;

    public Trip(String startLoc,String destLoc,String dateOfDep,String timeOfDep,String dateOfArrival,String timeOfArrival, int price)
    {
        this.startLoc = startLoc;
        this.destLoc = destLoc;
        this.dateOfDep = dateOfDep;
        this.timeOfDep = timeOfDep;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.price = price;
    }

    public String getStartLoc()
    {
        return startLoc;
    }

    public String getDestLoc() {
        return destLoc;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public int getPrice() {
        return price;
    }

    public String getDateOfDep() {
        return dateOfDep;
    }

    public String getTimeOfDep() {
        return timeOfDep;
    }

}
