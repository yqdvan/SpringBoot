package com.dyq.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello ! from jsp say");
        modelAndView.setViewName("say");
        return modelAndView;
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        return "这是一条个测试!";
    }

    @RequestMapping(value = "index")
    public String index(Model model){
        model.addAttribute("message","hello index!");
        return "say";
    }

}
