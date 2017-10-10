package com.wiltrahan;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Tesla -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Tesla -> accelerate()";
    }

    @Override
    public String brake() {
        return "Tesla -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Tesla tesla = new Tesla(6, "TypeS");
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());

        BMW BMW = new BMW(6, "M5");
        System.out.println(BMW.startEngine());
        System.out.println(BMW.accelerate());
        System.out.println(BMW.brake());

        Acura acura = new Acura(6, "TL");
        System.out.println(acura.startEngine());
        System.out.println(acura.accelerate());
        System.out.println(acura.brake());
    }
}
