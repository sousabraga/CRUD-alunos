package br.com.braga.crudalunos.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.braga.crudalunos.entity.Aluno;
import br.com.braga.crudalunos.repository.AlunosRepository;
import br.com.braga.crudalunos.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService, Serializable {

	private static final long serialVersionUID = 5543857219503350506L;

	@Autowired
	private AlunosRepository alunoRepository;

	@Override
	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	@Override
	public void save(Aluno aluno) {
		alunoRepository.save(aluno);
	}

	@Override
	public void delete(Long id) {
		alunoRepository.delete(id);
	}

	@Override
	public Aluno findOne(Long id) {
		return alunoRepository.findOne(id);
	}

}
