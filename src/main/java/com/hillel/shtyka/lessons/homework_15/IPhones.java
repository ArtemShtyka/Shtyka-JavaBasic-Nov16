package com.hillel.shtyka.lessons.homework_15;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from iOS device");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iOS device");
    }

    @Override
    public void internet() {
        System.out.println("Establishing internet connection from iOS device");
    }

    @Override
    public void retrieveIOS() {
        System.out.println("This is an iOS-powered device");
    }
}
