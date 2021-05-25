package ru.denris.springapp;

public class RockMusic implements Music{
    private static int count;
    private String name;

    public RockMusic() {
        count ++;
        this.name = "Rock song "+count;
    }

    @Override
    public String getSong() {
        //return "Rock song 1";
        return this.name;
    }
}
