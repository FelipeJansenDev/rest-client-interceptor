package com.restclientinterceptor.FelipeJansen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
	RestClient restClient() {
		return RestClient.builder().baseUrl(null).requestInterceptor(new RestClientInterceptor()).build();
	}
}



