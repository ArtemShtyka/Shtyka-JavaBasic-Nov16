package com.hillel.shtyka.lessons.homework_16;

public abstract class MusicStyles {
    private String band;

    public MusicStyles(String band) {
        this.band = band;
    }
    public String getBand() {
        return band;
    }

    public abstract void playMusic();
}
