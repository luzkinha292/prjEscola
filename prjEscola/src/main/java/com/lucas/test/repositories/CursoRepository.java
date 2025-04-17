package com.lucas.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.test.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
