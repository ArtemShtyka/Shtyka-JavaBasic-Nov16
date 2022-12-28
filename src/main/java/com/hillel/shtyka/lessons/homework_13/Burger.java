package com.hillel.shtyka.lessons.homework_13;

public class Burger {
    String bun, cheese, lettuce;
    boolean mayonnaise, extraBeef;

    public Burger(String bun, String cheese, String lettuce) {
        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        burgerContent(bun, cheese, lettuce, true, false);
    }
    public Burger(String bun, String cheese, String lettuce, boolean mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        burgerContent(bun, cheese, lettuce, mayonnaise, false);
    }
    public Burger(String bun, String cheese, String lettuce, boolean mayonnaise, boolean extraBeef) {
        this.bun = bun;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;//умовимося вважати, що бургер з подвійним м'ясом апріорі не може бути дієтичним
        this.extraBeef = extraBeef;
        burgerContent(bun, cheese, lettuce, mayonnaise, extraBeef);
    }
    void burgerContent(String bun, String cheese, String lettuce, boolean mayonnaise, boolean extraBeef) {
        System.out.println("Ваш вибір: " + ((extraBeef == true) ?
                ("бургер з подвійним м'ясом.") : ((mayonnaise == true) ? "класичний бургер." : "дієтичний бургер без майонезу.")) +
        "Булочка: " + bun + ", сир: " + cheese + ", зелень: " + lettuce);
    }
}
