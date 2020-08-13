package com.roger.study.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 使用@AspectJ注解标注为一个切面和POJO
 */
@Aspect
public class Audience {
    /**
     * 定义命名的切点
     */
    @Pointcut("execution(* com.roger.study.core.aspect.Performance.perform(..))")
    public void performance(){

    }



    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
