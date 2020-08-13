package com.roger.study.core.aspect;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过JavaConfig启动AspectJ注解的自动代理
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy     //启动AspectJ自动代理
public class JavaConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }


    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd=new BlankDisc();
        cd .setTitle("Sgt. Pepper's Longely Heartts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks=new ArrayList<>();
        tracks.add("Sgt. Pepper's Longely Heartts Club Band");
        tracks.add("With a Little Help from My Friends");


        cd .setTracks(tracks);
        return cd;

    }


    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
