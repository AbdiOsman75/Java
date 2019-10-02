package com.company;

public class Main {

    public static void main(String[] args) {
        // String is not a primitive but actually a class.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String laststring = "10";
        int myInt = 50;
        laststring = laststring + myInt;
        System.out.println("LastString is equal to " + laststring);

    }
}
