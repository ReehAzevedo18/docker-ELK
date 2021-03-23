package com.docker.service;

import com.docker.model.Curso;
import com.docker.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository cR;

    @Override
    public List<Curso> todosOsCursos() {
        return this.cR.findAll();
    }

    @Override
    public Curso obterPorId(String id) {
        return this.cR.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso não cadastrado!"));
    }

    @Override
    public Curso inserir(Curso curso) {
        return this.cR.save(curso);
    }

    @Override
    public Curso obterPorNome(String nome) {
        return this.cR.findByNome(nome);
    }
}
