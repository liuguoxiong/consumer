package com.example.demo.web.service.impl;

import com.example.demo.client.ProviderClient;
import com.example.demo.client.ToyStockClient;
import com.example.demo.web.service.ConsumerService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lgx
 * @date 2021/1/6  18:45
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    ProviderClient providerClient;
    @Resource
    ToyStockClient toyStockClient;

    @Override
    @GlobalTransactional(name = "AT-First")
    public String setOrder(int type) {
        providerClient.setOrder();
        if(type==1){
            toyStockClient.setToyStock();
        }else{
            toyStockClient.setToyStockException();
        }
        return "success";
    }

}
