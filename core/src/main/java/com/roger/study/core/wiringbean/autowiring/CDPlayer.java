package com.roger.study.core.wiringbean.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = false)  //没有匹配的bean Spring会抛出异常
    //@Inject  //源于Java依赖注入规范
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }

    @Override
    public void play(){
        cd.play();
    }
}
