package com.docker.controller;

import com.docker.model.Curso;
import com.docker.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping({"/Curso"})
public class CursoController {

    @Autowired
    private CursoService cS;

    private static final Logger log = LoggerFactory.getLogger(CursoController.class);

  /*  @GetMapping(value = "/soma")
    public  int soma(){
        int n1 = 2, n2 = 4;
        int s = n1 + n2;
        log.info("Requisição realizada com sucesso!");
        return s;
    }*/

    @GetMapping(value = "/hello")
    public String hello(){
        log.warn("GET/hello");
        return "Olá Renata!";

    }

    @GetMapping
    public List<Curso> todosOsCursos(){

        return this.cS.todosOsCursos();
    }


    @GetMapping(value = "/{id}")
    public Curso obterPorId(@PathVariable String id){
        log.info("Realizada consulta por ID");
        return this.cS.obterPorId(id);

    }

    @GetMapping(value = "/porNome")
    public Curso obterPorNome(@RequestParam("nome") String nome){
        return this.cS.obterPorNome(nome);
    }

    @PostMapping
    public Curso inserir(@RequestBody Curso curso){
        log.info("Cadastro de curso", curso);
        return this.cS.inserir(curso);
    }
}
