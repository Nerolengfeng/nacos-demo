package com.zjs.nacos.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacos
 * @description: provider
 * @author: 段闪闪 duanss
 * @create: 2019-01-21 10:56
 **/
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test(){
        return "this is port " + port;
    }

}
