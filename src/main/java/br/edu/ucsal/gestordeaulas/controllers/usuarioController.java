package br.edu.ucsal.gestordeaulas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ucsal.gestordeaulas.models.Aluno;
import br.edu.ucsal.gestordeaulas.repository.UsuarioRepository;

@Controller
public class usuarioController {
	
	@Autowired
	private UsuarioRepository er;
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.GET)
	public String formAluno() {
		return "usuario/cadastrarAluno";
	}
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.POST)
	public String formAluno(Aluno aluno) {
		 
		er.save(aluno);
		
		return "redirect:/cadastrarAluno";
	}
	
	@RequestMapping(value="/cadastrarProfessor", method=RequestMethod.GET)
	public String formProfessor() {
		return "usuario/cadastrarProfessor";
	}

}
