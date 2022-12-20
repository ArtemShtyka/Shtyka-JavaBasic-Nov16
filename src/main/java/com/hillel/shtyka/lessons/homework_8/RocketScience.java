package com.hillel.shtyka.lessons.homework_8;

public class RocketScience {
    public static void main(String[] args) {
        int i = 1, n = 100;
        System.out.print("Номери шатлів: ");
        while(i < n + 1) {
            String s = Integer.toString(i);
            if(!(s.contains("4") || s.contains("9"))) System.out.print(s + ((i != n) ? (", ") : ("")));
            else n += 1;
            i += 1;
        }
    }
}
