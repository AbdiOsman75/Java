package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (true) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            System.out.println("Is that your last number? Yes or No.");
            String answer = scanner.nextLine();
            if(answer=="Yes" || answer=="yes"){
                break;
            }

            counter++;
        }

        System.out.println("The sum is equal " + sum);
        scanner.close();
    }

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message gEnter number:h
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//Bonus:
//-Create a project with the name MinAndMaxInputChallenge.
}
