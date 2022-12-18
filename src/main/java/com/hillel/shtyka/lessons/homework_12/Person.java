package com.hillel.shtyka.lessons.homework_12;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        String[][] data = new String[3][4];
        Scanner userInput = new Scanner(System.in);
        int i = 0;
        while (i < data.length) {
            System.out.println("Введіть ім'я, прізвище, місто проживання та номер телефону громадянина " + (i+1));
            int j = 0;
            while(j < data[i].length) {
                String token = userInput.next();
                if(token.length() > 1) {
                    data[i][j] = token;
                    j += 1;
                }
                else System.out.println("Вказуйте дійсні значення аргументів!");
            }
            i += 1;
            userInput.nextLine();
        }
        System.out.println(personInfo(data[0][0], data[0][1], data[0][2], data[0][3]));
        System.out.println(personInfo(data[1][0], data[1][1], data[1][2], data[1][3]));
        System.out.println(personInfo(data[2][0], data[2][1], data[2][2], data[2][3]));
    }
    public static String personInfo(String firstName, String lastName, String address, String phoneNumber){
        return "Зателефонувати громадянину " + firstName + " " + lastName + " з міста " + address + " можна за номером: " + phoneNumber;
    }
}
