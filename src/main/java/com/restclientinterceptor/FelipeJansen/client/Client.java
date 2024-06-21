package com.restclientinterceptor.FelipeJansen.client;

import org.springframework.stereotype.Service;

@Service
public class Client {

    private final org.springframework.web.client.RestClient restClient;

    public Client(org.springframework.web.client.RestClient restClient) {
        this.restClient = restClient;
    }

    public void restClientAct() {
        restClient.post().retrieve();
    }

}
