package com.hillel.shtyka.lessons.lesson4;

import java.util.Scanner;
import java.lang.Math;

public class QuickMaths
{
    public static void main(String[] args)
    {
        float[] params = {1, 1, 1, 90, 90};
        float length,
                volume;
        int i = 0;
        System.out.println("Введіть довжини ребер 1, 2 основи, другого ребра 3 бічної грані, " +
                "значення кута 4 між ребрами основи та кута 5 між площиною основи та ребром бічної грані (для прямокутного паралелепіпеда - всі кути 90\u00B0), " +
                "розділяючи аргументи пробілом (\" \") ");
        Scanner userInput = new Scanner(System.in);
        while(i < 5)
        {
            String token = userInput.next();
            if (isFloat(token) && Float.parseFloat(token) != 0)
            {
                params[i] = Math.abs(Float.parseFloat(token));
                i += 1;
            }
            else
            {
                System.out.println("Вказуйте дійсні числа в якості аргументів!");
                i = 0;
            }
        }
        length = 4*params[0] + 4*params[1] + 4*params[2];
        volume = (float)((params[0]*(params[1]*Math.sin(params[3]*3.14/180)))*(params[2]*Math.sin(params[4]*3.14/180)));
        System.out.println("Вхідні дані: паралелепіпед зі сторонами " + params[0] + ", " + params[1] + " основи та кутом "
                + params[3] + "\u00B0 між ними, стороною " + params[2] + " бічної грані та кутом " + params[4] +"\u00B0 її нахилу.\n" +
                "Сума довжин всіх ребер паралелепіпеда: " + length + "; об'єм: " + volume);
    }
    public static boolean isFloat(String input)//Трохи підглянув на стековерфлоу та почитав на W3Schools, але сенс більш-менш зрозумілий
    {
        try
        {
            Float.parseFloat(input);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }
}

