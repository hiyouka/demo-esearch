package com.jy.controller.esearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * create by jianglei on 2018/8/1
 * @since 1.0.0
 */
@RestController
@RequestMapping("/select")
public class ESearchSelectController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getConnect")
    public String getConnect(){
        String forObject = restTemplate.getForObject("http://127.0.0.1:9200", String.class);
        return forObject;
    }

}