package com.example.demo.web;

import com.example.demo.client.ProviderClient;
import com.example.demo.web.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by forezp on 2019/5/11.
 */

@RestController
public class ConsumerController {
    @Resource
    ProviderClient providerClient;
    @Resource
    ConsumerService consumerService;

    @GetMapping("/getOrderServiceName")
    public String getOrderServiceName(){
       return providerClient.getName();
    }

/*    @GetMapping(value = "/setOrder")
    public String setOrder(int type) {
        return consumerService.setOrder(type);
    }*/
}
