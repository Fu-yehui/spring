package com.roger.study.core.spring_web.TilesViewResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
public class Config {

    /**
     * TilesConfigurer负责定位和加载Tile定义并协调生成Tiles
     * @return
     */
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tiles=new TilesConfigurer();
        tiles.setDefinitions(new String[]{   //指定Tile定义的位置
                "/WEB-INF/layout/tiles.xml"
        });
        tiles.setCheckRefresh(true);  //启用刷新功能
        return tiles;
    }

    @Bean
    public ViewResolver viewResolver(){
        return new TilesViewResolver();
    }
}
