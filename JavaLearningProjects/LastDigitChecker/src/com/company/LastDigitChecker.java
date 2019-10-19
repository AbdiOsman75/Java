package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {

        if ((x > 1000 || x < 10) || (y > 1000 || y < 10) || (z > 1000 || z < 10)) {
            return false;
        }

        int digitx = 0;
        int digity = 0;
        int digitz = 0;

        while ((x > 10) && (y > 10) && (z > 10)) {
            digitx = x % 10;
            x /= 10; // number = number / 10;
            digity = y % 10;
            y /= 10; // number = number / 10;
            digitz = z % 10;
            z /= 10; // number = number / 10;
        }

        if ((digitx==digity)||(digitx==digitz)||(digitz==digity)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValid (int number){
        if (number>1000 || number<10){
            return false;
        }else{
            return true;
        }
    }
}
