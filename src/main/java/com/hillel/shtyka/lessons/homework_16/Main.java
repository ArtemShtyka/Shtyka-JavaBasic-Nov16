package com.hillel.shtyka.lessons.homework_16;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] genres = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };
        for (MusicStyles i : genres) i.playMusic();
    }
}
