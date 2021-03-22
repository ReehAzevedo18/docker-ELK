package com.docker.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping({"/Curso"})
public class CursoController {

    private static final Logger log = LoggerFactory.getLogger(CursoController.class);

    @GetMapping(value = "/soma")
    public  int soma(){
        int n1 = 2, n2 = 4;
        int s = n1 + n2;
        log.info("Requisição realizada com sucesso!");
        return s;
    }

    @GetMapping(value = "/hello")
    public String hello(){
        log.warn("GET/hello");
        return "Olá Renata!";

    }



}
