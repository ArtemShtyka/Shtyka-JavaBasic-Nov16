package com.hillel.shtyka.lessons.homework_9;

import java.lang.Math;

public class Rugby {
    public static void main(String[] args) {
        int partySize = 25;
        int[] team1 = new int[partySize],
                team2 = new int[partySize];
        System.out.print("Вік гравців команди 1: \n");
        for(int i = 0; i < team1.length; i += 1) {
            team1[i] = prettyRandom(18, 45);
            System.out.print(team1[i] + " ");
        }
        System.out.print("\nВік гравців команди 2: \n");
        for(int i = 0; i < team2.length; i += 1) {
            team2[i] = prettyRandom(18, 45);
            System.out.print(team2[i] + " ");
        }
        System.out.println("\nСередній вік гравців: " +
                "\nкоманда 1: " + (int)arrayMean(team1) + " р. " + (int)((arrayMean(team1)%(int)(arrayMean(team1)))*12) + " м. " +
                "\nкоманда 2: " + (int)arrayMean(team2) +  " р. " + (int)((arrayMean(team2)%(int)(arrayMean(team2)))*12) + " м. ");
    }
    public static int prettyRandom(int bottom, int top) {
        return bottom + (int)(Math.random()*(top-bottom+1));
    }
    public static float arrayMean(int[] array) {
        float result = 0;
        for(int i : array) result += (float)i;
        return result/array.length;
    }
}
