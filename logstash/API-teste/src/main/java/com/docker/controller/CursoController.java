package com.docker.controller;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping({"/curso"})
public class CursoController {

    private static final Logger LOG = LoggerFactory.getLogger(CursoController.class);

    @GetMapping
    public int soma(){
        int n1 = 2, n2 = 4;
        int s = n1 + n2;
        LOG.info("Requisição realizada com sucesso!");
        LOG.error("Problema com a requisição!");
        return s;

    }
}
