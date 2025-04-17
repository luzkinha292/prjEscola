package com.lucas.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.test.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
