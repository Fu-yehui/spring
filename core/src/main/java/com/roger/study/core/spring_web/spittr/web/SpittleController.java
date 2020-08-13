package com.roger.study.core.spring_web.spittr.web;

import com.roger.study.core.spring_web.spittr.data.Spittle;
import com.roger.study.core.spring_web.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }

    @RequestMapping(method= RequestMethod.GET)
    /**
     * Model就是一个Mao，可以用Map代替Model
     */
    public String spittles(Model model){
        /**
         * 将spittle添加到模型中
         */
        model.addAttribute(
                "spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE,20)
        );
        return "spittles";  //返回视图名

    }


    /**
     * 查询参数
     * @param max
     * @param count
     * @return
     */
    @RequestMapping(method= RequestMethod.GET)
    public String spittles(@RequestParam("max") long max,@RequestParam("count") int count,Model model){
        model.addAttribute(
                "spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE,20)
        );
        return "spittles";  //返回视图名

    }

    /**
     * 路径变量
     * @return
     */
    @RequestMapping(value="/{spittleId}",method= GET)
    public String spitles(@PathVariable("spittleId") long spittleId,Model model){
        model.addAttribute(
                "spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE,20)
        );
        return "spittles";  //返回视图名
    }





    @RequestMapping(value="/register",method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }



    @RequestMapping(value="/register",method = POST)
    public String showRegistrationForm(@Valid  Spittle spittle, Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }
        return "redirect:/spittles/"+spittle.getId();
    }



    @RequestMapping(value="/{username}",method = GET)
    public String showSpitterProfile(@PathVariable("username")  String userName,Model model){
        return "profile";
    }



}
