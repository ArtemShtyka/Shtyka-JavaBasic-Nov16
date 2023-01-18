package com.hillel.shtyka.lessons.homework_17;

import java.util.Scanner;

public class Drinks {
    public static final double COFFEE_COST = 25,
    TEA_COST = 15,
    LEMONADE_COST = 20,
    MOJITO_COST = 35,
    WATER_COST = 10,
    COLA_COST = 30;

    static void prepareDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE: {
                System.out.println("Take your daily dose of coffee.");
                break;
            }
            case TEA: {
                System.out.println("Don't forget to take the tea bag out!");
                break;
            }
            case LEMONADE: {
                System.out.println("We kept this last bottle of lemonade specially for you.");
                break;
            }
            case MOJITO: {
                System.out.println("Enjoy your mojito!");
                break;
            }
            case WATER: {
                System.out.println("Gotta stay hydrated, huh?");
                break;
            }
            case COLA: {
                System.out.println("Rumors say this liquid is the ultimate rust cleaner.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        double sum = 0;
        DrinksMachine[] menu = DrinksMachine.values();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick yourself drinks from the list: " +
                "\ncoffee, tea, lemonade, mojito, water, cola" +
                "\nor type 'exit' to proceed to the cashbox");
        while(true) {
            String item = userInput.next();
            for(DrinksMachine choice : menu) {
                if(item.equalsIgnoreCase(choice.toString())) {
                    prepareDrink(choice);
                    sum += choice.getDrinkCost();
                }
            }
            if(item.equalsIgnoreCase("exit")) break;
        }
        System.out.println("You picked the drinks worth " + sum +"$. Thank you for your purchase!");
    }
}
