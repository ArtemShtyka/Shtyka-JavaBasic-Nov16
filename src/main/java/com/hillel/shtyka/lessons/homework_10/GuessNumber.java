package com.hillel.shtyka.lessons.homework_10;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    public static void main(String[] args) {
        int count = 1, attempts = 3, number = (int)(Math.random()*11);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Комп'ютером загадано випадкове число від 0 до 9 включно. \nСпробуйте вгадати це число у 3 спроби: \n");
        while(count <= attempts) {
            if(userInput.hasNextInt()) {
                int userGuess = userInput.nextInt();
                if(userGuess >= 0 && userGuess <= 10) {
                    if(userGuess == number) {
                        System.out.print("Вітаємо! Ви вгадали число з " + count + "-ї спроби!\n");
                        break;
                    }
                    else {
                        System.out.print("Спробуйте ще. " + ((count == 3) ? ("Спроби вичерпані.") : ("Залишилось спроб: " + (attempts-count) + ".\n")));
                        count += 1;
                    }
                }
                else System.out.print("Число повинно бути у діапазоні [0 - 9]\n");
            }
            else System.out.print("Вказуйте дійсне число в діапазоні [0 - 9]\n");
            userInput.nextLine();
        }
    }
}
