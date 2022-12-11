package com.hillel.shtyka.lessons.homework_6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        String[] teamName = new String[2];
        int[][] teamFrags = new int [2][5];
        Scanner userInput = new Scanner(System.in);
        int[] result = new int[2];
        int i = 0,
            j = 0;
        while(i < 2) {
            System.out.println("Введіть назву " + (i + 1) + "-ї команди:");
            teamName[i] = userInput.nextLine();
            if(teamName[i].length() > 0 && !teamName[i].equalsIgnoreCase(teamName[Math.abs(i-1)/*Не знаю, чи можна робити такі трюки*/])){

                System.out.println("Введіть кількість фрагів для " + teamFrags[i].length + " гравців команди " +
                        teamName[i] + ", розділяючи аргументи пробілом (\" \")");

                while (j < teamFrags[i].length) {
                    String token = userInput.next();
                    if(isInt(token) && Integer.parseInt(token) >= 0) {
                        teamFrags[i][j] = Math.abs(Integer.parseInt(token));
                        result[i] += teamFrags[i][j];
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

        System.out.println("Перемогла команда " + (result[0] >= result[1] ? (teamName[0] + ", набравши " + result[0] + " балів") :
                (teamName[1] + ", набравши " + result[1] + " балів")));
        System.out.println("Середній показник балів для команд: \n" + teamName[0] + ": " + (float)result[0]/teamFrags[0].length +
                "\n" + teamName[1] + ": " + (float)result[1]/teamFrags[1].length);

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
