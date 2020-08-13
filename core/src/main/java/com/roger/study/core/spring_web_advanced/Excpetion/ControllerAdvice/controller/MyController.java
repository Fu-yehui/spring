package com.roger.study.core.spring_web_advanced.Excpetion.ControllerAdvice.controller;

import com.roger.study.core.spring_web.spittr.data.Spittle;
import com.roger.study.core.spring_web_advanced.Excpetion.SpittleNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
@RequestMapping("/spittr")
public class MyController {


    /**
     * 通过@ResponseStatus将SpittleNotFoundException映射为HTTP状态码404

     */

    @ResponseStatus(value = HttpStatus.NOT_FOUND,
                    reason = "Spittle Not Found")
    @RequestMapping("/multipart")
    public String processRegistration(
            @RequestPart("profilePicture")byte[] profilePicture,
            @Valid Spittle spittle,
            Errors errors){
        if(errors.hasErrors()){
            throw new SpittleNotFoundException();
        }

        return "viewName";

    }

    @RequestMapping("registrationExceptionHandler")
    public String registration(@Valid Spittle spittle,Errors errors){

        try {
            if (errors.hasErrors()) {
                throw new SpittleNotFoundException();
            }

            return "viewName";

        }catch (SpittleNotFoundException ex){
            return "Spittle Not Found";
        }


    }


    /**
     * 不需要自己进行异常处理
     * @param spittle
     * @param errors
     * @return
     */
    @RequestMapping("registrationExceptionHandler")
    public String registrationExceptionHandler(@Valid Spittle spittle,Errors errors){


            if (errors.hasErrors()) {
                throw new SpittleNotFoundException();
            }

            return "viewName";



    }


    /**
     * 这个控制器中所有处理器方法只要抛出SpittleNotFoundException异常，
     * 都会委托该方法进行处理
     *
     * 减少重复的异常处理代码
     * @return
     */
    @ExceptionHandler(SpittleNotFoundException.class)
    public String handler(){
        return "Spittle Not Found";
    }
}
