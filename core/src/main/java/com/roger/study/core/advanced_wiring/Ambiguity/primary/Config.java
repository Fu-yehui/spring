package com.roger.study.core.advanced_wiring.Ambiguity.primary;

import com.roger.study.core.advanced_wiring.Ambiguity.primary.Cake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Config {

    @Bean
    @Primary   //使用JAVA配置首选bean
    public Cake cake(){
        return cake();
    }
}
