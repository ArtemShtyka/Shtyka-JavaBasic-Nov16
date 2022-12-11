package com.hillel.shtyka.lessons.homework_6;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {

        /*System.out.println("Введіть назву першої команди:");
        while(true) {
            team1Label = userInput.nextLine();
            if(team1Label.length() == 0) {
                System.out.println("Назва команди має містити принаймні один символ.");
            }
            else break;
        }
        System.out.println("Введіть назву другої команди:");
        while (true) {
            team2Label = userInput.nextLine();
            if (team2Label.length() == 0) {
                System.out.println("Назва команди має містити принаймні один символ.");
            }
            else {
                if(team2Label.equalsIgnoreCase(team1Label)) {
                    System.out.println("Назви команд не мають повторюватись.");
                }
                else break;
            }
        }*/

        String[] teamName = new String[2];
        int[][] teamFrags = new int [2][5];
        Scanner userInput = new Scanner(System.in);
        int i = 0,
            j = 0,
            result = 0;
        while(i < 2) {
            System.out.println("Введіть назву " + (i + 1) + "-ї команди:");
            teamName[i] = userInput.nextLine();
            if(teamName[i].length() > 0 && !teamName[i].equalsIgnoreCase(teamName[Math.abs(i-1)/*Не знаю, чи можна робити такі трюки*/])){

                System.out.println("Введіть кількість фрагів для " + teamFrags[i].length + " гравців команди " +
                        teamName[i] + ", розділяючи аргументи пробілом (\" \")");

                while (j < 5) {
                    String token = userInput.next();
                    if(isInt(token) && Integer.parseInt(token) >= 0) {
                        teamFrags[i][j] = Math.abs(Integer.parseInt(token));
                        j += 1;
                    }
                    else {
                        System.out.println("Вказуйте дійсні числа в якості аргументів.");
                    }
                }
                j = 0;
                i += 1;
                userInput.nextLine();
            }
            else System.out.println("Назва команди має містити принаймні один символ та не повторюватись для іншої команди.");
        }
        System.out.println("Перемогла команда");

    }
    public static boolean isInt(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }
    }
}
