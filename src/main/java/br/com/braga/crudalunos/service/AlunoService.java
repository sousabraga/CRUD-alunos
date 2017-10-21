package br.com.braga.crudalunos.service;

import java.util.List;

import br.com.braga.crudalunos.entity.Aluno;

public interface AlunoService {

	List<Aluno> findAll();
	
	void save(Aluno aluno);
	
	void delete(Long id);
	
	Aluno findOne(Long id);
	
}
