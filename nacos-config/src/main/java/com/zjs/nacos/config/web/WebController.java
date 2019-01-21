package com.zjs.nacos.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacos
 * @description: web
 * @author: 段闪闪 duanss
 * @create: 2019-01-21 13:27
 **/
@RestController
@RequestMapping("/config")
@RefreshScope
public class WebController {

    @Value("${user.name}")
    private String useLocalCache;

    @RequestMapping("/get")
    public String get(){
        return useLocalCache;
    }

}
