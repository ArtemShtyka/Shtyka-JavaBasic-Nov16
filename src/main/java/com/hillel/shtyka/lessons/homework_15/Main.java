package com.hillel.shtyka.lessons.homework_15;

public class Main {
    public static void main(String[] args) {
        IPhones iPhone14 = new IPhones();
        iPhone14.retrieveIOS();
        iPhone14.call();
        iPhone14.sms();
        iPhone14.internet();
        Androids someHuawei = new Androids();
        someHuawei.retrieveLinuxOS();
        someHuawei.call();
        someHuawei.sms();
        someHuawei.internet();
    }
}
