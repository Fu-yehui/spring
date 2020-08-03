package com.roger.study.core.wiringbean.javaconfigwiring;

import com.roger.study.core.wiringbean.autowiring.CDPlayer;
import com.roger.study.core.wiringbean.autowiring.CompactDisc;
import com.roger.study.core.wiringbean.autowiring.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CDPlayerConfig {

    @Bean   //将方法返回的对象注册为Spring =上下文中的bean  bean.ID=方法名
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }


    @Bean  //创建CDPlayer bean时，会自动装配CompactDisc bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

    @Bean    //直接调用方法得到CompactDisc bean,装配进CDPlayer中
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
