package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	The eight primitive data types in Java are boolean, byte, char, short, int, long, float, and double.
	 */

        //INT
        int myValue = 10000;
        // Using Integer as wrapper class, we can find out the min or max value of an int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //OVERFLOW
        //Integer Maximum Value = 2147483647
        //Busted Max Value = -2147483648
        // By adding  one to the Max Int Value, we can see that it carries over to the Min Int Value
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        //UNDERFLOW
        //Integer Minimum Value = -2147483648
        //Busted Min Value = 2147483647
        // By subtracting one from the Min Int Value, we can see that it carries over to the Max Int Value
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));


        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        //Byte Maximum Value = 127
        //Busted Max Value = 128
        System.out.println("Busted MAX Value = " + (myMaxByteValue + 1));
        //Integer Minimum Value = -128
        //Busted Min Value = -129
        System.out.println("Busted MIN Value = " + (myMinByteValue - 1));

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        //Short Maximum Value = 32767
        //Busted Max Value = 32768
        System.out.println("Busted MAX Value = " + (myMaxShortValue + 1));
        //Integer Minimum Value = -32768
        //Busted Min Value = -32769
        System.out.println("Busted MIN Value = " + (myMinShortValue - 1));
    /*
    Byte occupies 8 bits, hence 2^8 size
    Short occupies 16 bits, hence 2^16 size
    Int occupies 32 bits, hence 2^32 size
    Long occupies 64 bits, hence 2^64 size
     */

        //Long values require L at the end of the number
        long myLongValue = 100L;

        //LONG
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        //Long Maximum Value = 9223372036854775807
        //Busted Max Value = -9223372036854775808
        System.out.println("Busted MAX Value = " + (myMaxLongValue + 1));
        //Integer Minimum Value = -9223372036854775808
        //Busted Min Value = 9223372036854775807
        System.out.println("Busted MIN Value = " + (myMinLongValue - 1));

        //ARITHMETIC
        int myTotal = (myMinIntValue / 2);
    /* byte myNewByteValue = (myMinByteValue/2); gives an error because the default type
     for the result of an arithmetic operation is an int*/

        //CASTING
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        long myNewLongValue = (myMinLongValue / 2);


    /*
    So your challenge is to create some variables.
    First on is a variable of type byte, where you can set it to any valid type byte number, doesn't matter.
    Also then do the same for a short variable, setting it to any valid short number, and then create an int variable,
    setting to any valid int number.
    Lastly, then create a variable of type long, and make that equal to 50,000 plus 10 times the sum of the byte plus
    the short plus the integer values. So that's your challenge.
     */

        byte challengeByteValue = 40;
        short challengeShortValue = 10000;
        int challengeIntValue = 350000;

        long challengeLongValue = (50000L + (10L * (challengeByteValue + challengeShortValue + challengeIntValue)));
        System.out.println(challengeLongValue);
    }
}
