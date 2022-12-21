package com.hillel.shtyka.lessons.homework_10;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Lottery {

    public static void main(String[] args) {
        int pool = 7,
                i,
                matches = 0;
        int[] set = new int[pool],
                guess = new int[pool];
        for(i = 0; i < pool; i += 1){
            set[i] = prettyRandom(0, 9);
        }
        Scanner userInput = new Scanner(System.in);
        i = 0;
        while(i < 7){
            String token = userInput.next();
            if(isInt(token)){
                int n = Integer.parseInt(token);
                if(n >= 0 && n < 10){
                    guess[i] = n;
                    //if(guess[i] == set[i]) matches += 1;
                    i += 1;
                    System.out.print(" " + set[i] + " | " + guess[i] + " ");
                }
                else System.out.println("Each number must be between 0 and 9 inclusively");
            }
            else System.out.println("Enter the correct number");
        }
        Arrays.sort(set);
        Arrays.sort(guess);
        for(i = 0; i < pool; i += 1){
            if(guess[i] == set[i]) matches += 1;
        }
        System.out.println("Кількість збігів: " + matches);
    }
    public static int prettyRandom(int bottom, int top){
        return bottom + (int)(Math.random()*((top-bottom)+1));
    }
    public static boolean isInt(String x){
        try{
            Integer.parseInt(x);
            return true;
        }
        catch(NumberFormatException ABC){
            return false;
        }
    }
}