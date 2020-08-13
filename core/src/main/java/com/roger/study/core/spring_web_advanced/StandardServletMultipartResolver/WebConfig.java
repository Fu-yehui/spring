package com.roger.study.core.spring_web_advanced.StandardServletMultipartResolver;

import com.roger.study.core.spring_web.spittr.data.MarkInterface_Data;
import com.roger.study.core.spring_web.spittr.web.MarkInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的bean(Web组件的bean)
 */
@Configuration
@EnableWebMvc       //启动Spring MVC
@ComponentScan(basePackageClasses = {MarkInterface.class, MarkInterface_Data.class})
public class WebConfig implements WebMvcConfigurer {

    /**
     * 注册MultipartResolver，具体配置在web.xml和Servlet初始化类中,
     * 将multipart的具体细节作为DispatcherServlet配置的一部分
     */
    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

}
