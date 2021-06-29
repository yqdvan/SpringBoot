package com.dyq.springboot.service.impl;

import com.dyq.springboot.mapper.ShopMapper;
import com.dyq.springboot.model.Shop;
import com.dyq.springboot.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public Shop queryShopById(Integer id) {

        return shopMapper.selectByPrimaryKey(id);
    }
}
