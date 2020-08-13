package com.roger.study.core.advanced_wiring.scope;

import com.roger.study.core.advanced_wiring.Ambiguity.qualifier.annotation.Cookie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration


public class Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //将该bean声明为原型 prototype
    //@Scope("prototype")
    public Cookie cookie(){
        return cookie();
    }
}
