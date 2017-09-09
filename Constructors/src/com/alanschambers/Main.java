package com.alanschambers;

public class Main {

    public static void main(String[] args) {

        // uses default parameters, constructor
        Account bobsAccount = new Account();
        // Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(209) 406-5938");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account alansAccount = new Account("Alan","alan@email.com","12345");
        System.out.println(alansAccount.getCustomerName() + "'s Account Number: " + alansAccount.getNumber());

    }
}
