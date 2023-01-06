package com.hillel.shtyka.lessons.homework_16;

public class RockMusic extends MusicStyles {
    public RockMusic(String band) {
        super(band);
    }
    @Override
    public void playMusic() {
        System.out.println("Currently playing: " + getBand() + " (rock)");
    }
}
