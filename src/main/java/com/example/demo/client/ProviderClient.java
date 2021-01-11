package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by forezp on 2019/5/11.
 */
@FeignClient("order")
public interface ProviderClient {

    @GetMapping("/order/getName")
    String getName();
}


