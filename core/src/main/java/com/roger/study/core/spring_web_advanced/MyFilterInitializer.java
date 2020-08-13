package com.roger.study.core.spring_web_advanced;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MyFilterInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //注册Filter
        FilterRegistration.Dynamic filter=servletContext.addFilter("myFilter",MyFilter.class);
        //添加Filter的映射路径
        filter.addMappingForUrlPatterns(null,false,"/custom/**");
    }
}
