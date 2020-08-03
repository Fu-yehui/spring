package com.roger.study.core.wiringbean.confound.javaconfig_xml;

import com.roger.study.core.wiringbean.confound.javaconfig_xml.CDConfig;
import com.roger.study.core.wiringbean.confound.javaconfig_xml.CDPlayerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 根配置文件类
 */

@Configuration

@Import({CDConfig.class , CDPlayerConfig.class }) //使用@Import将两个配置类组合在一起
@ImportResource("classpath:com/roger/study/core/wiringbean/confound/javaconfig_xml/cd-config.xml")  //将配置在XML文件中的bean加载到Spring容器中
public class SoundSystemConfig {
}
