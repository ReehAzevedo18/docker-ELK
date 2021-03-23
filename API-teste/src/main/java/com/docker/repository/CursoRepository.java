package com.docker.repository;

import com.docker.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {

    public Curso findByNome(String nome);
}
