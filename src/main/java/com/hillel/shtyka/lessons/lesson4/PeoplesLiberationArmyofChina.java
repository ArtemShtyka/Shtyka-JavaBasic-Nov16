package com.hillel.shtyka.lessons.lesson4;

public class PeoplesLiberationArmyofChina
{
    public static void main(String[] args)
    {
        int[] dmgLi = {13, 24, 46},
            dmgMing = {9, 35, 12};
        int partySize = 860;
        double multiplier = 1.5;
        System.out.println("Загальні показники атаки:\n династія Лі: " + partySize*(dmgLi[0] + dmgLi[1] + dmgLi[2])
        + "\n Династія Мінь: " + (int)(partySize*multiplier*(dmgMing[0] + dmgMing[1] + dmgMing[2])));
    }
}
