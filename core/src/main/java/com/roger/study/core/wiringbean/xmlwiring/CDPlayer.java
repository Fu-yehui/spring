package com.roger.study.core.wiringbean.xmlwiring;

import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public void setCd(CompactDisc cd){
        this.cd=cd;
    }
    @Override
    public void play(){
        cd.play();
    }
}
