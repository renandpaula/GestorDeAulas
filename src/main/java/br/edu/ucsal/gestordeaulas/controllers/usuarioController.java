package br.edu.ucsal.gestordeaulas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usuarioController {
	
	@RequestMapping("/cadastrarAluno")
	public String formAluno() {
		return "usuario/cadastrarAluno";
	}
	
	@RequestMapping("/cadastrarProfessor")
	public String formProfessor() {
		return "usuario/cadastrarProfessor";
	}

}
