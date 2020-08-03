package com.roger.study.core.advanced_wiring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return magicBean();
    }
}
