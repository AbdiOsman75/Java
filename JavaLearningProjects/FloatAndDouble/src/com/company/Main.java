package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Float is a single precision number, meaning it can hold 2^32 number.
	Double is a double precision number,meaning it can hold 2^64 number.
	*/
	//Float minimum value =1.4E-45
    //Float maximum value =3.4028235E38
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
	System.out.println("Float minimum value =" + myMinFloatValue);
	System.out.println("Float maximum value =" + myMaxFloatValue);

	//Double minimum value =4.9E-324
    //Double maximum value =1.7976931348623157E308
	double myMinDoubleValue = Double.MIN_VALUE;
	double myMaxDoubleValue = Double.MAX_VALUE;
	System.out.println("Double minimum value =" + myMinDoubleValue);
	System.out.println("Double maximum value =" + myMaxDoubleValue);

	//Double is the default for floating point numbers, float x = 5.25 gives an error, but float x = 5.25f is fine or
    float myFirstFloafValue = 5f;
    int myFirstIntValue = 5;
    double myFirstDoubleValue = 5d;
	System.out.println("My Int Value = " + myFirstIntValue);
	System.out.println("My Float Value = " + myFirstFloafValue);
	System.out.println("My Double Value = " + myFirstDoubleValue);
	
	float mySecondFloafValue = 5f / 2f;
    int mySecondIntValue = 5 / 2;
    double mySecondDoubleValue = 5d / 2d;
	System.out.println("My Int Value = " + mySecondIntValue);
	System.out.println("My Float Value = " + mySecondFloafValue);
	System.out.println("My Double Value = " + mySecondDoubleValue);
	
	float myThirdFloafValue = 5f / 3f;
    int myThirdIntValue = 5 / 3;
    double myThirdDoubleValue = 5d / 3d;
	System.out.println("My Int Value = " + myThirdIntValue);
	System.out.println("My Float Value = " + myThirdFloafValue);
	System.out.println("My Double Value = " + myThirdDoubleValue);

	//CHALLENGE
    /*
    So the challenge here is to convert a given number of pounds to kilogrammes. So here are the steps that you'll need
    to take. Firstly, you'll need to create a variable with the appropriate type to store the number of pounds that
    we want to convert into kilogrammes. Then you wanna calculate the result of that.
    So, i.e. the number of kilogrammes based on the contents of the variable above, then you wanna store that result
    into a second variable with the appropriate type.
    And third, we wanna print out the result of your calculation.
     */

    double poundValue=200d;

    double kilogramValue = poundValue*0.45359237d;

    System.out.println(poundValue + "lb is equal to " + kilogramValue + "kg");



    }
}
