package com.bus;

import java.util.ArrayList;
import java.util.Arrays;

public class GoBus extends Vendor {
    private ArrayList<Trip> trips;


    public GoBus()
    {
        //hardcoded trips to simulate a RESTful/SOAP/CORBA service
        Trip trip1 = new Trip("Galway","Cork","11/10/18","12:10","11/10/18","15:30",20);
        Trip trip2 = new Trip("Dublin","Belfast","11/10/18","13:10","11/10/18","16:30",30);
        Trip trip3 = new Trip("Killarney","Castlebar","11/10/18","11:10","11/10/18","15:30",30);
        trips = new ArrayList<>(Arrays.asList(trip1,trip2,trip3));
    }

    @Override
    public ArrayList<Trip> getAllTrips() {
        //simulating a SOAP service
        return trips;
    }

    @Override
    public boolean bookTrip(Trip trip) {
        //simulating a booking
        System.out.println("Booked trip with GoBus from " + trip.getStartLoc()+" to " + trip.getDestLoc() );
        return true;
    }
}


