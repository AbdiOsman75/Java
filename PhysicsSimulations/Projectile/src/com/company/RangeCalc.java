package com.company;

public class RangeCalc {
    RangeCalc(double speed, double angleInDegrees) {
        double angleInRads;
        double range; // declare three variables
        double g = 9.81; // SI units
        angleInRads = angleInDegrees * Math.PI / 180;
        range = 2 * speed * speed *
                Math.sin(angleInRads) * Math.cos(angleInRads) / g;
        System.out.println("Range = " + range + " meters");
    }
}
