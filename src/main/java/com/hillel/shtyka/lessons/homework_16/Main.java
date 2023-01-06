package com.hillel.shtyka.lessons.homework_16;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] genres = {
                new PopMusic("The Beatles"),
                new RockMusic("AC/DC"),
                new ClassicMusic("J. S. Bach")
        };
        for (MusicStyles i : genres) i.playMusic();
    }
}
