package com.roger.study.core.spring_web_advanced.StandardServletMultipartResolver;

import com.roger.study.core.spring_web.spittr.config.RootConfig;
import com.roger.study.core.spring_web.spittr.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
    继承AbstractAnnotationConfigDispatcherServletInitializer得到的
    DispatcherServlet，通过重载customizeRegistration()方法来配置multipart
    的具体细节
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration){
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads",
                        2097152,4194404,0)
        );
    }









    /**
     * ContextLoaderListener加载应用上下文时，使用定义在RootConfig配置类中的bean(驱动应用后端的中间层和数据层组件的bean)
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的bean(Web组件的bean)
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * 将一个或者多个路径映射到DispatcherServlet上
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
