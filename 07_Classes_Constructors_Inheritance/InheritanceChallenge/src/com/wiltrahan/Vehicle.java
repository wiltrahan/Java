package com.wiltrahan;

public class Vehicle {

    private String name;
    private String color;
    private int wheels;
    private int currentSpeed;


    public Vehicle(String name, String color, int wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.currentSpeed = 0;
    }

    public void move(int speed) {
        this.currentSpeed = speed;
        System.out.println("Vehicle.move() called. " + "Vehicle is going " + this.currentSpeed + " mph.");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;

    }
}
