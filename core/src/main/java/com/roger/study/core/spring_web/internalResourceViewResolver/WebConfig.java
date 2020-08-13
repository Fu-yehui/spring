package com.roger.study.core.spring_web.internalResourceViewResolver;

import com.roger.study.core.spring_web.spittr.data.MarkInterface_Data;
import com.roger.study.core.spring_web.spittr.web.MarkInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的bean(Web组件的bean)
 */
@Configuration
@EnableWebMvc       //启动Spring MVC
@ComponentScan(basePackageClasses = {MarkInterface.class, MarkInterface_Data.class})
public class WebConfig implements WebMvcConfigurer {

    /**
     * 配置JSP视图解析器
     * @return
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views");
        resolver.setSuffix(".jsp");
        /**
         * 使得InternalResourceViewResolver将视图解析为JstlView对象
         *
         * 默认是 InternalResourceView
         */
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);

        return resolver;
    }


    /**
     * 静态资源的处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }


}
