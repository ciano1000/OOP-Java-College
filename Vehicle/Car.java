package com.example.learning_java;

public class Car {
    private String name;
    private int distanceToGo;
    private int totalDistance;

    private Wheel wheel;
    private Engine engine;
    private Door door;

    public Car(String name)
    {
        this.name = name;

    }

    public void add(Wheel wheel)
    {
        this.wheel = wheel;
    }
    public void add(Engine engine)
    {
        this.engine = engine;
    }
    public void add(Door door)
    {
        this.door= door;
    }

    public void setFuel(int fuel)
    {
        engine.setFuel(fuel);
        System.out.println("Tank filled to: "+engine.getFuel());
    }

    public void setDistanceToGo(int distanceToGo)
    {
        this.distanceToGo = distanceToGo;
    }

    public int getDistanceToGo()
    {
        return  distanceToGo;
    }

    public void drive()
    {
            int turnsPerLitre = engine.getTurnsPerLitre();
            double distancePerTurn = wheel.turn();

            engine.setTotalTurns(engine.getFuel()*turnsPerLitre);
            double tripDistance = engine.getTotalTurns()*distancePerTurn;

            if(tripDistance>=distanceToGo)
            {
                tripDistance = distanceToGo;
                engine.setTotalTurns(tripDistance/distancePerTurn);
                engine.setFuelBurned(engine.getTotalTurns()/engine.getTurnsPerLitre());
                System.out.println("Arrived at destination!! Distance travelled: "+ tripDistance+" Fuel Burned: "+engine.getFuelBurned());
            }
            else if(tripDistance<distanceToGo)
            {
                distanceToGo -= tripDistance;
                System.out.println("Car is out of fuel!! Travelled: "+tripDistance+" Distance to go: "+distanceToGo);
            }

    }
}
