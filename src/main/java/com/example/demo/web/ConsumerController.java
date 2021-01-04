package com.example.demo.web;

import com.example.demo.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by forezp on 2019/5/11.
 */

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/getOrderServiceName")
    public String getOrderServiceName(){
       return providerClient.getName();
    }

    @GetMapping("/setOrder")
    public String setOrder(){
        return providerClient.setOrder();
    }
}
