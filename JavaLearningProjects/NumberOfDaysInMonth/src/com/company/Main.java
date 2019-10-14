package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDayInMonth.isLeapYear(2018));
        System.out.println(NumberOfDayInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDayInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDayInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDayInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDayInMonth.getDaysInMonth(1,-2020));


    }
}
