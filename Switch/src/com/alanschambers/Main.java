package com.alanschambers;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char charValue = 'a';
        switch(charValue) {
            case 'a':
                System.out.println("a was found");
                break;
            case 'b':
                System.out.println("b was found");
                break;
            case 'c':
                System.out.println("c was found");
                break;
            default:
                System.out.println("no charValue found");
                break;
        }

        String month = "JuNE";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
