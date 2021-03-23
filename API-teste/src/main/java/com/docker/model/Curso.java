package com.docker.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Curso {

    @Id
    private String id;
    private String nome;
    private String dtInicio;
    private String dtFim;
    private float preco;
    private String obs;

}
