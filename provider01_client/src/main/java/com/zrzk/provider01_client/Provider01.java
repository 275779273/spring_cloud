package com.zrzk.provider01_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test1")
@RequestMapping("/demo1")
public interface Provider01 {

    @RequestMapping("/get")
    String get();
}
