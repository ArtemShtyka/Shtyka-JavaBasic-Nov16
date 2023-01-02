package com.hillel.shtyka.lessons.homework_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //getters: name, birthDate, email, phoneNumber
        //setters: surName, weight, bloodPressure, pedometer
        Tracker Artyom = new Tracker("Artyom", "Shtyka", 1997, 90, 120, 20000, "thisisarandomemail@gmail.com", "+380(96)-969-6969");
        System.out.println(Artyom.printAccountInfo());
        Tracker Mike = new Tracker("Mike", "Tyson", 1966, 100, 80, 15000, "donking@gmail.com", "+1(425)-123-4567");
        System.out.println(Mike.printAccountInfo());
        Mike.setSurname("\"Iron Mike\" Tyson");
        Mike.weight = 7874;
        System.out.println(Mike.printAccountInfo());
        Tracker Amber = new Tracker("Amber", "Depp", 1986, 50, 100, 50, "whatever@gmail.com", "+1(234)-567-8910");
        System.out.println(Amber.printAccountInfo());
        Amber.setSurname("Heard");
        Amber.weight = 90;
        Amber.bloodPressure = 140;
        Amber.pedometer = 20000;
        System.out.println(Amber.printAccountInfo());
    }
}