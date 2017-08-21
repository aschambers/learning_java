package com.alanschambers;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int myIntValue = 5 / 2;
	    // handles precision, width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 2f;
	    // java assumes numbers with a decimal point are a double
        // width of double = 64 (8 bytes)
        // faster on most modern computers, more precise, inbuilt functions use double
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        double pi = 3_000_000.1415927d;
        System.out.println("value of pi = " + pi);
    }
}
