package com.alanschambers;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

        // do while is guarenteed to execute once, whereas while loop is not, infinite loop possibility
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
