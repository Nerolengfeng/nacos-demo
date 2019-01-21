package com.zjs.nacos.consumer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacos
 * @description: consumer
 * @author: 段闪闪 duanss
 * @create: 2019-01-21 10:58
 **/
@RestController
public class ConsumerController {

    @GetMapping("/test")
    public String test(){
        return "consumer";
    }

}
