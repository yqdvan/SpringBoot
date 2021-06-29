package com.dyq.springboot.web;

import com.dyq.springboot.model.Shop;
import com.dyq.springboot.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ShopController {
    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/shop")
    @ResponseBody
    public Object shop(Integer id){
        Shop shop = shopService.queryShopById(id);
        return shop;
    }
}
