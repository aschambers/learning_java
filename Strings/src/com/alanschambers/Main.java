package com.alanschambers;

public class Main {

    public static void main(String[] args) {
        // primitive data types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // string: sequence of characters, numbers/letters/etc. (really a class)

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("The result is " + numberString);
        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString = " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString = " + lastString);

    }
}
