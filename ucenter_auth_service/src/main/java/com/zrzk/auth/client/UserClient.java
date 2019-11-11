package com.zrzk.auth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator.
 */
@FeignClient(value = "")
public interface UserClient {
    //根据账号查询用户信息
    @GetMapping("/ucenter/getuserext")
    String getUserext(@RequestParam("username") String username);
}
