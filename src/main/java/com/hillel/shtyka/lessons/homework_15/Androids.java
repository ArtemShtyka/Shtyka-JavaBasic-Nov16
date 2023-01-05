package com.hillel.shtyka.lessons.homework_15;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Calling from Android device");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android device");
    }

    @Override
    public void internet() {
        System.out.println("Establishing internet connection from Android device");
    }

    @Override
    public void retrieveLinuxOS() {
        System.out.println("This is a Linux-powered device");
    }
}
