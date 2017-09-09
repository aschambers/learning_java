package com.alanschambers;

public class Car {

    // private keyword means, don't allow a class outside the Car class
    // if it is private, you can't access the variables in the main class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setter method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comodore")) {
            // type "this" when you are referring to the field of a class, field = private String model
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter method
    public String getModel() {
        return this.model;
    }
}
