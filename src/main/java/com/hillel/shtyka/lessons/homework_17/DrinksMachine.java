package com.hillel.shtyka.lessons.homework_17;

public enum DrinksMachine {
    COFFEE(Drinks.COFFEE_COST),
    TEA(Drinks.TEA_COST),
    LEMONADE(Drinks.LEMONADE_COST),
    MOJITO(Drinks.MOJITO_COST),
    WATER(Drinks.WATER_COST),
    COLA(Drinks.COLA_COST);
    private final double cost;
    DrinksMachine(double cost) {
        this.cost = cost;
    }
    public double getDrinkCost() {
        return cost;
    }
}
