package com.Tial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//    Music music = context.getBean("musicBean", Music.class);
//    MusicPlayer musicPlayer = new MusicPlayer(music);
//    MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//    System.out.println(firstMusicPlayer);
//
//    System.out.println(musicPlayer.getName());
//    System.out.println(musicPlayer.getVolume());

    context.close();
    }

}
