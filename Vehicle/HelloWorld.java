package com.example.learning_java;

public class HelloWorld {
    public static void main(String[] args)
    {
        Car car = new Car("Audi A8");
        Door door = new Door("uL9",4);
        Wheel wheel = new Wheel("Sicheline M9",20);
        Engine engine = new Engine("Mach 2.0", 5);

        car.add(door);
        car.add(wheel);
        car.add(engine);

        car.setDistanceToGo(3000);
        car.setFuel(15);

        car.drive();

        Car secondCar = new Car("Ferrari 350");
        Door secondDoor = new Door("tu67",4);
        Wheel secondWheel = new Wheel("cRp23", 10);
        Engine secondEngine = new Engine("SS998",5);

        secondCar.add(secondDoor);
        secondCar.add(secondWheel);
        secondCar.add(secondEngine);

        secondCar.setDistanceToGo(4000);
        secondCar.setFuel(10);
        secondCar.drive();

    }
}
