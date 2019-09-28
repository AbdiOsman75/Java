package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Float is a single precision number, meaning it can hold 2^32 number.
	Double is a double precision number,meaning it can hold 2^64 number.
	*/
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
	System.out.println("Float minimum value =" + myMinFloatValue);
	System.out.println("Float maximum value =" + myMaxFloatValue);
    }
}
