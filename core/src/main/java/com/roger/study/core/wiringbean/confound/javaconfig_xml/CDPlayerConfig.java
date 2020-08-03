package com.roger.study.core.wiringbean.confound.javaconfig_xml;


import com.roger.study.core.wiringbean.autowiring.CompactDisc;

import com.roger.study.core.wiringbean.confound.javaconfig_xml.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
