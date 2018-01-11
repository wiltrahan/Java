package com.wiltrahan;

public class Car extends Vehicle {

    private int doors;
    private boolean isManual;
    private int gears;
    private boolean hasNav;

    private int currentGear;

    public Car(String name, String color, int wheels, int currentSpeed, int doors, boolean isManual, int gears, boolean hasNav) {
        super(name, color, wheels);
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.hasNav = hasNav;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int speed) {
        move(speed);
        System.out.println("Car.changeSpeed() called.  Current speed: " + speed + "mph.");
    }

}
