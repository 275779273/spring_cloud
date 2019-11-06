package com.zrzk.provider01.service;

import com.zrzk.provider02.client.Product02Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private Product02Client product02Client;

    public void get(){
        product02Client.get ();
    }
}
