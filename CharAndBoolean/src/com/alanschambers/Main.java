package com.alanschambers;

public class Main {

    public static void main(String[] args) {
        char myChar = 'A';
        char myChar2 = '\u00A9';
        System.out.println("myChar2 = " + myChar2);

        boolean myBoolean = true;
        char registeredSymbol = '\u00AE';
        System.out.println("registered symbol: " + registeredSymbol);
    }
}
