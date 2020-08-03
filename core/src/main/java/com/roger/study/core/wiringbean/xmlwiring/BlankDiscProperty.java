package com.roger.study.core.wiringbean.xmlwiring;

import com.roger.study.core.wiringbean.autowiring.CompactDisc;

import java.util.List;

public class BlankDiscProperty implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title){
        this.title=title;
    }
    public void setArtist(String artist){
        this.artist=artist;
    }
    public void setTracks(List<String> tracks){
        this.tracks=tracks;
    }


    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
