package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Min Pin");
        dog.breathe();
        dog.eat();

        Larry larry = new Larry("Hick from French Lick");
        larry.breathe();
        larry.eat();
        larry.fly();

        Penguin penguin = new Penguin("Mario");
        penguin.fly();
    }
}
