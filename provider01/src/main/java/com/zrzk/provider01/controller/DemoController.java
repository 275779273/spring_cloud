package com.zrzk.provider01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo1")
@RestController
@RefreshScope
public class DemoController {

    @Value ( "${env}" )
    private String env;

    @RequestMapping("/get")
    public String get(){
        System.out.println("provider01   "+env);
        return "provider01"+env;
    }
}
