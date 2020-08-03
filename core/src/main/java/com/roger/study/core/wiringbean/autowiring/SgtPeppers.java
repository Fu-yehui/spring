package com.roger.study.core.wiringbean.autowiring;

import org.springframework.stereotype.Component;

@Component()  //bean id默认=类名（第一个字母小写）
//@Named("longelyHeartsClud")  可以作为@Component注解的代替方案
public class SgtPeppers implements CompactDisc {
    private String title="Sgt.Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";

    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
