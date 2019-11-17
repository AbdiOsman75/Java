package com.company;

public class HealthyBurger extends Hamburger{
    private String healthExtra1Name;
    private double healhyExtra1Price;

    private String healthExtra2Name;
    private double healhyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealthyAddition(String name, double price){
        this.healthExtra1Name=name;
        this.healhyExtra1Price=price;
    }

    public void addTomato(String name, double price){
        this.healthExtra2Name=name;
        this.healhyExtra2Price=price;
    }

    @Override
    public double totalPriceOfBurger() {
        double hamburgerPrice = super.totalPriceOfBurger();
        if (this.healthExtra1Name!=null){
            hamburgerPrice+=this.healhyExtra1Price;
            System.out.println("Added "+ this.healthExtra1Name+ " for an extra "+
                    this.healhyExtra1Price);
        }

        if (this.healthExtra2Name!=null){
            hamburgerPrice+=this.healhyExtra2Price;
            System.out.println("Added "+ this.healthExtra2Name+ " for an extra "+
                    this.healhyExtra2Price);
        }

        return hamburgerPrice;
    }
}
