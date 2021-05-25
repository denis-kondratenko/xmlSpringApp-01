package ru.denris.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //Inversion of control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic(){
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    //любой модификатор доступа
    private void doingPostCreate(){
        System.out.println("Doing MusicPlayer post-creation");
    }
    //вызывается только у singleton
    private void doingPreDestroy(){
        System.out.println("Doing MusicPlayer pre-destroying");
    }
}
