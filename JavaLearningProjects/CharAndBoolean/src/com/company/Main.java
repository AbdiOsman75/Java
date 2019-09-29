package com.company;

public class Main {

    public static void main(String[] args) {

        //char can only store a single character
        //char occupies two bytes of memory, or 16 bits. which is 2^16.
        char myChar = 'D';

        //UNICODE
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        //BOOLEAN
        boolean myTrueBooleanValue = true;
        boolean myFlaseBooleanValue = false;

        boolean isCustomerOver21 = true;

    }
}
