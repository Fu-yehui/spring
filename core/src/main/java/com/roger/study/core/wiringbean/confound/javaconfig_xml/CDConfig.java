package com.roger.study.core.wiringbean.confound.javaconfig_xml;

import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
