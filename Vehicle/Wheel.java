package com.example.learning_java;

public class Wheel {
    private String name;
    private int radius;
    private double circumference;

    public Wheel(String name, int radius)
    {
        this.name = name;
        this.radius = radius;
        circumference = 2 * Math.PI*radius;
    }

    public double turn()
    {
        return circumference;
    }
}
