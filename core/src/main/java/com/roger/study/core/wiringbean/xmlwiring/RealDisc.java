package com.roger.study.core.wiringbean.xmlwiring;

import com.roger.study.core.wiringbean.autowiring.CDPlayer;
import com.roger.study.core.wiringbean.autowiring.CompactDisc;

import java.util.List;
import java.util.Set;

public class RealDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;
    private List<CompactDisc> cds;
    private Set<CDPlayer> cdPlayers;

    public RealDisc(String title, String artist, List<String> tracks, List<CompactDisc> cds, Set<CDPlayer> cdPlayers){
        this.title=title;
        this.artist=artist;
        this.tracks=tracks;
        this.cds=cds;
        this.cdPlayers = cdPlayers;
    }
    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}