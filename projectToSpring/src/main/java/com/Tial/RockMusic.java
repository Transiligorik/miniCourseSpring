package com.Tial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> listSongs = new ArrayList<>();


    public List<String> addList(){
        listSongs.add("song111");
        listSongs.add("song222");
        listSongs.add("song3333");
        return listSongs;
    }

    @Override
    public List<String> getSongs(){
        return addList();
    }
}
