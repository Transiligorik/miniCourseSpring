package com.Tial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.multi.MultiScrollBarUI;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Music music1 = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//         System.out.println(music1.getSong());
//        System.out.println(music2.getSong());

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
