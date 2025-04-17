package com.lucas.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.test.entities.Aluno;
import com.lucas.test.services.AlunoService;

@RestController
public class AlunoController {
	
private final AlunoService alunoService;
	
	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	@PostMapping("/criar")
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoService.saveAluno(aluno);
	}
	
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id) {
		return alunoService.findAlunoById(id);
	}
	
	@GetMapping("/todos")
	public List<Aluno> getAllAlunos() {
		return alunoService.findAllAluno();
	}
	
}
