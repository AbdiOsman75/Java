package com.company;

public class Door {
    private double height;
    private double width;
    private String material;
    private String colour;

    public Door(double height, double width, String material, String colour) {
        this.height = height;
        this.width = width;
        this.material = material;
        this.colour = colour;
    }

    public void open(){
        System.out.println("Dining room -> opened");
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
