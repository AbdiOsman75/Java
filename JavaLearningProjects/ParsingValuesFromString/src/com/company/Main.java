package com.company;

public class Main {

    public static void main(String[] args) {
        String stringNumber = "9999";
        System.out.println("String number: " +stringNumber);

        int number = Integer.parseInt(stringNumber);
        System.out.println("Number: "+number );

        double doubleNumber = Double.parseDouble(stringNumber);
        System.out.println("Number: "+doubleNumber );

        stringNumber += 1;
        number += 1;

        System.out.println("String number: " +stringNumber);
        System.out.println("Number: "+number );

        /*Adding a letter to stringNumber gives an error. As it cannot be
        be converted to an int.
         */


        /*
        Adding a decimal to stringNumber, causes an error as it cannot be
        converted to an int.
         */
    }
}
