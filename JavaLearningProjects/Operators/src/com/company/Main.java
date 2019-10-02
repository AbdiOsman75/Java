package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1+2; // 1+2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result -1; // 3 - 1 =2
        System.out.println("3 - 1 = " + result);

        result = result *10; // 2 * 10 = 20
        System.out.println("2 * 10 = " +result);

        result = result/5; // 20 / 5 =4
        System.out.println("20 / 5 = " + result);

        result = result%3; // the remainder of ( 4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1; is identical to result++;
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2; is equal to result += 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result*= 10; //  3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; //  30 / 3 = 10
        System.out.println("30 / 3  = " + result);

        result -= 2; //  10 - 2 = 8
        System.out.println("10 - 2  = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 100;
        if(topScore == 100 ){
            System.out.println("You got the high score!");
        }

        //AND logical operator
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than 100");
        }

        //More clear
        if ((topScore > secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }

        //OR Logical operator
        if((topScore>90) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }

        // if(isCar) is the same as if(isCar==true)
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppose to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");

        //Operator Challenge
        /*
        Step 1 is to create a double variable with a value of 20.00.
        Step 2 create a second variable of type double with a value 80.00.
        Step 3 is to add both numbers together then multiply by 100.00.
        Step 4 use the remainder operator to figure out what the remainder from the result of the operation in step 3
        and 40.00 is.
        Step 5 create a Boolean variable that assigns the value true if the remainder in step 4 is 0.00 or false
        if it's not zero.
        Step 6 output the Boolean variable just to see what the result is.
        Step 7 write an if-then statement that displays a message 'got some remainder' if the Boolean in step five
        is not true.
         */

        double firstVal = 20.00d;
        double secondVal = 80.00d;

        double total = (firstVal + secondVal)*100.00d;

        double remainder = total%40.00d;
        System.out.println("The remainder is " + remainder);

        boolean isZero = (remainder == 0) ? true : false;

        System.out.println("isZero "+isZero);

        if (!isZero){
            System.out.println("Got some remainder");
        }
        }
    }
}
