package com.roger.study.core.spring_web_advanced.Excpetion.ControllerAdvice;

import com.roger.study.core.spring_web_advanced.Excpetion.SpittleNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ControllerAdvice本身使用@Component，可以被组件扫描获取
 *
 * 带有@ControllerAdvice的类中，
 * 所有带有  @ExceptionHandler,@InitBinder,@ModelAttribute
 * 注解的方法会运用在整个应用程序的所有控制器中带有 @RequestMapping注解的方法上
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    /**
     * 整个应用程序中所有控制器中带有 @RequestMapping注解的方法
     * 只要抛出SpittleNotFoundException异常，都会被该方法进行处理
     *
     * 将所有控制器中所有相同异常处理放在一个地方，进行一致处理
     *
     * @return
     */
    @ExceptionHandler(SpittleNotFoundException.class)
    public String handler(){
        return "Spittle Not Found";
    }
}
