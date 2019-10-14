package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Acutally it was a " + switchValue);
                break;

            default:
                System.out.println("Was not a number");
                break;
        }
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char switcChar = 'B';

        switch (switcChar){
            case 'A':
                System.out.println("This is the letter A");
                break;
            case 'B':
                System.out.println("This is the letter B");
                break;
            case 'C':
                System.out.println("This is the letter C");
                break;

            case 'D':
                System.out.println("This is the letter D");
                break;
            case 'E':
                System.out.println("This is the letter E      ");
                break;
            default:
                System.out.println("It is not A, or B, or C, or D, or E");
                break;
        }

        printDayOfTheWeek(5);
        printDayOfTheWeek(12);


    }

    //        Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//                The method should not return any value (hint: void)
//
//        Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//        Bonus:
//        Write a second solution using if then else, instead of using switch.
//        Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a day of the week");
                break;
        }
    }
}
