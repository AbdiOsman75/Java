package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        while(Math.abs(number) > 0){
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if((reverse == num) == true){
            return true;
        } else {
            return false;
        }
    }
}
