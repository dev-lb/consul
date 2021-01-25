package com.jg.consul.sconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String index() {
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://service-provider/", HttpMethod.GET, null, String.class);
        return responseEntity.getBody();
    }
}
