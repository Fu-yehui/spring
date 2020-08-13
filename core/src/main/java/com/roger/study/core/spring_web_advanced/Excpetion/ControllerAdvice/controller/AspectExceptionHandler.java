package com.roger.study.core.spring_web_advanced.Excpetion.ControllerAdvice.controller;

import com.roger.study.core.spring_web_advanced.Excpetion.SpittleNotFoundException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 通过切面将controller包中的所有控制器的所有方法中抛出
 * SpittleNotFoundException异常的处理放在一个地方
 */
@Aspect
public class AspectExceptionHandler {
    @Pointcut("execution(* com.roger.study.core.spring_web_advanced.Excpetion.ControllerAdvice.controller.*.*(..) throws Exception)" +
            "&& args(ex)")
    public void exceptionThrow(Exception ex){

    }

    @AfterThrowing("exceptionThrow(ex)")
    public String exceptionHandler(Exception ex){
        if(ex.getClass().equals(SpittleNotFoundException.class)) {
            return "Spittle Not Found";
        }
        else{
            return null;
        }
    }

}
