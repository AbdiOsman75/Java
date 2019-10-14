package com.company;

public class DigitSum {
//    Write a method with the name sumDigits that has one int parameter called number.
//
//    If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//    The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.
//
//    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//    Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//
//            Hint:
//    Use n % 10 to extract the least-significant digit.
//    Use n = n / 10 to discard the least-significant digit.
//    The method needs to be static like other methods so far in the course.
//
//    Tip:
//    Create a project with the name DigitSumChallenge.
    //My solution.
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int thousandth = (number%10000)/1000;
        int hundredth = (number%1000)/100;
        int tenth = (number%100)/10;
        int digit = number % 10;
        if (thousandth < 0){
            return thousandth=0;
        }else if (hundredth < 0){
            return hundredth=0;
        }else if (tenth < 0){
            return tenth = 0;
        }
        System.out.println(thousandth);
        System.out.println(hundredth);
        System.out.println(tenth);
        System.out.println(digit);
        int sum = thousandth+hundredth+tenth+digit;
        return sum;
    }

    //Better solution
    public static int sum(int number){
        if (number < 10){
            return -1;
        }

        int sum=0;
        // 125 -> 125/10 = 12 -> 12*10 = 120 -> 125-120 = 5
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number/= 10; // number = number / 10;

        }
        return sum;
    }
}
