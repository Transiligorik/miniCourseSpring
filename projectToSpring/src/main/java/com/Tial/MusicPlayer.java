package com.Tial;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();


    public MusicPlayer(){}

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

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

//    public void playMusic() {
//        for(Music music1: musicList) {
//            System.out.println("Playing:  " + music1.getSong());
//        }
//    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
