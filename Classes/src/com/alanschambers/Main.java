package com.alanschambers;

public class Main {

    public static void main(String[] args) {
        // create an object call porsche from Car template.
        Car porsche = new Car();
        Car holden = new Car();

        // would print null, since no model is set
//        System.out.println("Model of porsche is : " + porsche.getModel());

        porsche.setModel("Carrera");

        // prints Carrera, as we used are setter to set the model to Carrera
        System.out.println("Model of porsche is : " + porsche.getModel());
    }
}
