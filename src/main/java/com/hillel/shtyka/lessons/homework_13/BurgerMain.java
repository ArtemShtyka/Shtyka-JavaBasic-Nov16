package com.hillel.shtyka.lessons.homework_13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new Burger("пшенична", "найдорожчий в АТБ", "листя салату");
        Burger dietBurger = new Burger("житня", "камамбер", "петрушка", true);
        Burger extraBeefBurger = new Burger("дріжджова", "чеддар", "трава з-під паркану", false, true);
    }
}
