package br.com.braga.crudalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.com.braga.crudalunos.entity.Aluno;
import br.com.braga.crudalunos.service.AlunoService;
import br.com.braga.crudalunos.util.StatusAluno;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private AlunoService alunosService;

	@GetMapping
	public ModelAndView listaDeAlunos() {
		ModelAndView modelAndView = new ModelAndView("lista-alunos");
		modelAndView.addObject("listaDeAlunos", alunosService.findAll());
		
		return modelAndView;
	}
	
	@GetMapping("/novo")
	public ModelAndView adicionarNovoAluno() {
		ModelAndView modelAndView = new ModelAndView("novo-aluno");
		modelAndView.addObject("aluno", new Aluno());
		modelAndView.addObject("listaDeStatus", StatusAluno.values());
		modelAndView.addObject("tituloDaPagina", "Cadastro de Aluno");
		
		return modelAndView;
	}
	
	@PostMapping("/salvar")
	public RedirectView salvarAluno(Aluno aluno) {
		alunosService.save(aluno);
		
		return new RedirectView("/alunos", true);
	}
	
	@GetMapping("/excluir/{id}")
	public RedirectView excluirAluno(@PathVariable Long id) {
		alunosService.delete(id);
		
		return new RedirectView("/alunos", true);
	} 
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarAluno(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("novo-aluno");
		modelAndView.addObject("aluno", alunosService.findOne(id));
		modelAndView.addObject("listaDeStatus", StatusAluno.values());
		modelAndView.addObject("tituloDaPagina", "Alteração de Aluno");
		
		return modelAndView;
	} 
	
}
