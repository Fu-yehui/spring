package com.roger.study.core.spring_web.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 配置DispatcherServlet
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * ContextLoaderLIstener加载应用上下文时，使用定义在RootConfig配置类中的bean(驱动应用后端的中间层和数据层组件的bean)
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
