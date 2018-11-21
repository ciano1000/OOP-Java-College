package com.bus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Vendor> vendors = new ArrayList<>();
        vendors.add(new BusEireann());
        vendors.add(new CityLink());
        vendors.add(new GoBus());
        ArrayList<Trip> trips  = new ArrayList<>();
        for (Vendor vendor: vendors
             ) {
            ArrayList<Trip>  trip= vendor.getAllTrips();
            trips.addAll(trip);
        }
        for (Trip trip:trips
             ) {
            System.out.println(trip.getStartLoc()+" "+trip.getDestLoc()+" "+trip.getPrice());

        }


    }
}
