package com.hillel.shtyka.lessons.homework_16;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String band) {
        super(band);
    }

    @Override
    public void playMusic() {
        System.out.println("Currently playing: " + getBand() + " (classic)");
    }
}
