package com.roger.study.core.wiringbean.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//使用Java代码定义了Spring的装配规则

@Configuration
//@ComponentScan    //启动组建扫描,默认扫描该配置类所在包和包下所有的子包，将带有@Component注解的类都注册为bean
//@ComponentScan("com.roger.study.core.wiringbean.autowiring") 指定不同的基础包 （base-package)
//@ComponentScan(basePackages={"com.roger.study.core.wiringbean.autowiring","otherPackage"})扫描多个基础包
//上面的基础包是以String类型表示的

@ComponentScan(basePackageClasses={MarkerInterface.class}) //将这些类所在的包作为组件扫描的基础包




public class CDPlayerConfig {
}
