package com.Tial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> listSongs = new ArrayList<>();

    {
        listSongs.add("Hungarian Rhapsody");
        listSongs.add("Symphony no. 5 in C Minor, op. 67");
        listSongs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs(){
        return listSongs;
    }
}
