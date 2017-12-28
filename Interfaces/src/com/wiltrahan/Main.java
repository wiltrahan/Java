package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        ITelephone wilsPhone;
        wilsPhone = new DeskPhone(123456);
        wilsPhone.powerOn();
        wilsPhone.callPhone(123456);
        wilsPhone.answer();


        wilsPhone = new MobilePhone(234567);
        wilsPhone.powerOn();
        wilsPhone.callPhone(234567);
        wilsPhone.answer();
    }
}
