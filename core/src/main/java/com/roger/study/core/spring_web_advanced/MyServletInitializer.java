package com.roger.study.core.spring_web_advanced;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


/**
 * 通过WebApplicationInitializer来注册Servlet
 */
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //注册Servlet
        Dynamic myServlet=servletContext.addServlet("myServlet",MyServlet.class);
        //映射Servlet
        myServlet.addMapping("/custom/**");
    }
}
