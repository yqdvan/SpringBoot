package com.dyq.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(String message){
        return " say : hello multi environment !" + message;
    }

    @RequestMapping(value = "/mapvalue")
    @ResponseBody
    public Map<String,Object> mapValue(){
        Map<String ,Object> map = new HashMap<>();
        map.put("message","spring boot map");
        return  map;
    }

    @RequestMapping(value = "/fuck")
    @ResponseBody
    public ModelAndView fuck(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello fucker!");
        mv.setViewName("index");

        return mv;
    }
}
