package com.wiltrahan;




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
