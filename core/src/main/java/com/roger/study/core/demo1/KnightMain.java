package com.roger.study.core.demo1;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:/home/roger/github-project/spring/core/src/main/java/com/roger/study/core/demo1/knights.xml");
//        Knight knight=context.getBean(Knight.class);
//        knight.embarkOnQuest();
//        context.close();


        System.out.println("----------------------");
        ApplicationContext context1=new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight1=context1.getBean(Knight.class);
        knight1.embarkOnQuest();



    }
}
