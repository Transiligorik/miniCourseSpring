package com.Tial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private  MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

//    public void playMusicComputer() {
//        System.out.println(musicPlayer.playMusic(Style.Rock));
//    }

//    @Override
//    public String toString() {
//        return "Computer: " +
//                " " +
//                " , " + musicPlayer.playMusic();
//    }
}
