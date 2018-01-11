package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
		Tesla tesla = new Tesla("Black", 0, 4, 6, "TypeS", true);
		tesla.accelerate(60);
		tesla.changeSpeed(40);
		tesla.stop();
    }
}
