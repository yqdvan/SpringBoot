package com.dyq.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return " say : hello !";
    }

    @RequestMapping(value = "/mapvalue")
    @ResponseBody
    public Map<String,Object> mapValue(){
        Map<String ,Object> map = new HashMap<>();
        map.put("message","spring boot map");
        return  map;
    }
}
