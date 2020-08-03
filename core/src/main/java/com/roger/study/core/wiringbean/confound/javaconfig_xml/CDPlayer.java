package com.roger.study.core.wiringbean.confound.javaconfig_xml;

import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    public CDPlayer(CompactDisc cd){

        this.cd=cd;
    }

    @Override
    public void play(){
        cd.play();
    }
}
