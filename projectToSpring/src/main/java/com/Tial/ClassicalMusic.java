package com.Tial;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("doing my destrcation");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
