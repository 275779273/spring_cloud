package com.zrzk.provider02.client;

import com.zrzk.provider01_client.Provider01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo02")
public class Product02Client {

    /*@Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private Provider01 provider01;

    @RequestMapping("/get")
    public String get(){
        System.out.println(" demo02 ");
        /*String forObject = restTemplate.getForObject("http://test" + "/demo1/get", String.class);*/
        String s = provider01.get();
        System.out.println("s = " + s);
        return s;
    }
}
