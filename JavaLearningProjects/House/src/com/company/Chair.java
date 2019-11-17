package com.company;

public class Chair {
    private double legs;
    private String colour;
    private String material;

    public Chair(double legs, String colour, String material) {
        this.legs = legs;
        this.colour = colour;
        this.material = material;
    }

    public double getLegs() {
        return legs;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
