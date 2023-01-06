package com.hillel.shtyka.lessons.homework_16;

public class PopMusic extends MusicStyles {
    public PopMusic(String band) {
        super(band);
    }
    @Override
    public void playMusic() {
        System.out.println("Currently playing: " + getBand() + " (pop)");
    }
}
