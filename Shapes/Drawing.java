package com.bus;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private String color;
    private List<Shape> shapes;

    public Drawing()
    {
        shapes = new ArrayList<>();
        color = "black";
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws IllegalArgumentException{

        if(color.toLowerCase().equals("black") || color.toLowerCase().equals("red") || color.toLowerCase().equals("blue"))
        {
            this.color = color;
        }
        else
        {
            throw  new IllegalArgumentException();
        }
    }

    public  void add(Shape shape)
    {
        shapes.add(shape);
    }

    public void add(Drawing drawing)
    {
        List<Shape> newList = new ArrayList<>();
        newList.addAll(drawing.getShapes());
        newList.addAll(shapes);
        shapes = newList;
    }

    public void  remove(Shape shape)
    {
        shapes.remove(shape);
    }

    public void print()
    {
        for (Shape shape:
            shapes ) {
            String shapeName = shape.getClass().getSimpleName();
            System.out.println("Drawing "+shapeName +" with color "+ color);
        }
    }



}
