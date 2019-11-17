package com.company;

public class Table {
    private String colour;
    private String material;
    private double legs;
    private double length;
    private double width;
    private double height;

    public Table(String colour, String material, double legs, double length, double width, double height) {
        this.colour = colour;
        this.material = material;
        this.legs = legs;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getLegs() {
        return legs;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
