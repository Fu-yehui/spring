package com.roger.study.core.spring_web_advanced.CommonsMultipartResolver;

import com.roger.study.core.spring_web.spittr.data.MarkInterface_Data;
import com.roger.study.core.spring_web.spittr.web.MarkInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.io.IOException;

/**
 * DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的bean(Web组件的bean)
 */
@Configuration
@EnableWebMvc       //启动Spring MVC
@ComponentScan(basePackageClasses = {MarkInterface.class, MarkInterface_Data.class})
public class WebConfig implements WebMvcConfigurer {

    /**
     * 如果需要将应用部署到非Servlet 3.0的容器中，需要配置CommonsMultipartResolver，
     *
     * 并不强制要求设置临时文件路径
     * 默认在Serlvet容器的临时目录
     */
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver();
        multipartResolver.setUploadTempDir(
                new FileSystemResource("/tem/spittr/uploads")
        );
        multipartResolver.setMaxUploadSize(2097152);
        multipartResolver.setMaxInMemorySize(0);

        return multipartResolver;
    }

}
