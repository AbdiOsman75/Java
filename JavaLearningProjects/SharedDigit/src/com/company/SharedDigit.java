package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if ((firstNumber > 99 ||firstNumber < 10)||secondNumber > 99 ||secondNumber < 10){
            return false;
        }
        int firstNumbera = 0;
        int firstNumberb= 0;
        int secondNumbera=0;
        int secondNumberb=0;

        while (firstNumber > 0 && secondNumber >0){
            firstNumbera = firstNumber % 10;
            firstNumber/=10;
            firstNumberb = firstNumber%10;
            firstNumber=0;
            secondNumbera = secondNumber % 10;
            secondNumber/=10;
            secondNumberb = secondNumber%10;
            secondNumber=0;
        }

        if ((firstNumbera==secondNumbera)||(firstNumbera==secondNumberb)){
            return true;
        }else if ((firstNumberb==secondNumbera)||(firstNumberb==secondNumberb)){
            return true;
        }else{
            return false;
        }

    }
}
