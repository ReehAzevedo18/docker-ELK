package com.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SleuthController {

    private static Logger log = LoggerFactory.getLogger(SleuthController.class);


    @GetMapping(value = "/fullDetails")
    public String testApp(){
        log.info("/sleuth");
        String teste = "Testando Sleuth em uma nova controller";
        return teste;
    }
}

