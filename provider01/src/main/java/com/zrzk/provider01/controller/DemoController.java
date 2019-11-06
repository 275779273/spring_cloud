package com.zrzk.provider01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo1")
@RestController
public class DemoController {

    @RequestMapping("/get")
    public String get(){
        System.out.println("provider01");
        return "provider01";
    }
}
