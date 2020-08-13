package com.roger.study.core.spring_web_advanced.multipart;

import com.roger.study.core.spring_web.spittr.data.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;

import javax.validation.Valid;

@Controller
@RequestMapping("/spittr")
public class MyController {

    /**
     * 通过@RequestPart将表单请求中对应part（name=profilePicture）的数据绑定到byte[]中
     * @param profilePicture
     * @param spittle
     * @param errors
     * @return
     */
    @RequestMapping("/multipart")
    public String processRegistration(
            @RequestPart("profilePicture")byte[] profilePicture,
            @Valid Spittle spittle,
            Errors errors){

        return "viewName";

    }
}
