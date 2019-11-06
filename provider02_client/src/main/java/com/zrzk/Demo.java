package com.zrzk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test")
@RequestMapping("/demo01")
public interface Demo {

    @RequestMapping("/get")
    String get();
}
