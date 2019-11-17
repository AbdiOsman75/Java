package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage and Turker", 16.45);
        super.addAddition1("Chips",3.00);
        super.addAddition2("Drink",1.50);
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional item");
    }
}
