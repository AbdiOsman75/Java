package com.company;

public class NumberOfDayInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        int day=31;
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                day = 31;
                break;
            case 4:case 6:case 9:case 11:
                day = 30;
            break;
            case 2:
                if (isLeapYear(year)) {
                    day = 29;
                } else if (!isLeapYear(year)) {
                    day = 28;
                }
                break;
        }
        return day;
    }
}
