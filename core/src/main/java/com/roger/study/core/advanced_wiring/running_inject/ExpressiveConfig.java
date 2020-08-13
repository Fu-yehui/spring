package com.roger.study.core.advanced_wiring.running_inject;

import com.roger.study.core.wiringbean.xmlwiring.BlankDisc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//声明属性源
@PropertySource("classpath:app.properties")

public class ExpressiveConfig {

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(
                environment.getProperty("disc.title"),
                environment.getProperty("disc.artist")
        );
    }


    /**
     * 用来解析占位符
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
