package com.restclientinterceptor.FelipeJansen.controller;

import com.restclientinterceptor.FelipeJansen.client.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestClientController {

    private final Client request;

    public RestClientController(Client request) {
        this.request = request;
    }

    @GetMapping()
    public void getAccount(){
        request.restClientAct();
    }

}
