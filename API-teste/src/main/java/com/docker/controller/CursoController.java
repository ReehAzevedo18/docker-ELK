package com.docker.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping({"/Curso"})
public class CursoController {

    private static final Logger log = LoggerFactory.getLogger(CursoController.class);

    @GetMapping
    public  int soma(){
        int n1 = 2, n2 = 4;
        int s = n1 + n2;
        log.info("Requisição realizada com sucesso!");
        log.error("Problema com a requisição!");
        return s;
    }

//    @GetMapping(value = "/hello")
//    public String hello(){
//        log.info("GET/hello");
//        return "Olá Renata!";
//    }
//


}
