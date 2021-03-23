package com.docker.service;

import com.docker.model.Curso;

import java.util.List;

public interface ICursoService {

    public List<Curso> todosOsCursos();
    public Curso obterPorId(String id);
    public Curso inserir(Curso curso);
    public Curso obterPorNome(String nome);

}
