package com.roger.study.core.advanced_wiring.running_inject;

import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist){
        this.title=title;
        this.artist=artist;
    }
    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
