package com.example.learning_java;

public class Engine {
    private String name;
    private int fuelLevel;
    private int turnsPerLitre;
    private double totalTurns;
    private double fuelBurned;

    public Engine(String name, int turnsPerLitre)
    {
        this.name = name;
        this.turnsPerLitre = turnsPerLitre;
    }

    public void setFuel(int fuelLevel)
    {
        this.fuelLevel = fuelLevel;
    }

    public int getFuel()
    {
        return this.fuelLevel;
    }

    public int getTurnsPerLitre()
    {
        return this.turnsPerLitre;
    }

    public void setTotalTurns(double totalTurns)
    {
        this.totalTurns = totalTurns;
    }

    public double getTotalTurns()
    {
        return this.totalTurns;
    }

    public double getFuelBurned()
    {
        return this.fuelBurned;
    }

    public void setFuelBurned(double fuelBurned)
    {
        this.fuelBurned = fuelBurned;
        if(this.fuelLevel-fuelBurned <0)
        {
            this.fuelLevel = 0;
        }
        else
        {
            this.fuelLevel -= fuelBurned;
        }

    }
}
