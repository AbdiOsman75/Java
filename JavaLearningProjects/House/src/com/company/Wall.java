package com.company;

public class Wall {
    private double height;
    private double width;
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
        this.height=1;
        this.width=1;
    }

    public Wall(String direction, double height, double width) {
        this.direction = direction;
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
