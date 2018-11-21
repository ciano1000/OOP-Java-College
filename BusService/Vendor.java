package com.bus;

import java.util.ArrayList;

public abstract class Vendor {
    public abstract ArrayList<Trip> getAllTrips();
    public abstract boolean bookTrip(Trip trip);
}
