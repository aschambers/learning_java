package com.alanschambers;

public class Main {

    public static void main(String[] args) {

        // general rule, use integers

        // int has width of 32
        // more readable, need java 8 selected so no error.
        int myMinValue = -2_147_483_648;
        // less readable
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has width of 8
        // bytes can only store a number -128 to 127 (takes up less space on computer)
        byte myByteValue = -128;
        // casting, keep it a byte, otherwise error
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has width of 16
        // shorts -32768 to 32767, bigger (twice the space as a byte).
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue / 2);

        // long has width of 64 (2^63 is biggest it can be)
        long myLongValue = 9_223_372_036_854_775_807L;

        // challenge

        byte byte1 = 26;
        short short1 = 150;
        int int1 = 999;
        // long accepts integers, no casting needed
        long long1 = 50000 + (10 * (byte1 + short1 + int1));
        short shortTotal = (short) (1000 + 10 * (byte1 + short1 + int1));
        System.out.println("long value: " + long1);
        System.out.println("short total: " + shortTotal);
    }
}
