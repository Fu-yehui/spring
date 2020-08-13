package com.roger.study.core.spring_web.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * ContextLoaderLIstener加载应用上下文时，使用定义在RootConfig配置类中的bean(驱动应用后端的中间层和数据层组件的bean)
 */
@Configuration
@ComponentScan( basePackageClasses = {},
excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)
})
public class RootConfig {
}
