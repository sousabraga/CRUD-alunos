package br.com.braga.crudalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.braga.crudalunos.entity.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long> {

}
