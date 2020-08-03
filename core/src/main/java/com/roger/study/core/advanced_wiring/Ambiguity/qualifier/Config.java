package com.roger.study.core.advanced_wiring.Ambiguity.qualifier;

import com.roger.study.core.advanced_wiring.Ambiguity.primary.Cake;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Config {

    @Bean
    @Qualifier("soft")  //使用JAVA配置自定义限定符
    public Cake cake(){
        return cake();
    }
}
