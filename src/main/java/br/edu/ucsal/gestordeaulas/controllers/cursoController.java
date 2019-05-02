package br.edu.ucsal.gestordeaulas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ucsal.gestordeaulas.models.Curso;
import br.edu.ucsal.gestordeaulas.repository.CursoRepository;

@Controller
public class cursoController {
	
	@Autowired
	private CursoRepository cr;
	
	@RequestMapping(value="/cadastrarCursos", method=RequestMethod.GET)
	public String formCurso() {
		return "cursos/cadastrarCursos.jsp";
	}
	
	@RequestMapping(value="/cadastrarCursos", method=RequestMethod.POST)
	public String formCurso(Curso curso) {
		 
		cr.save(curso);
		
		return "redirect:/cadastrarCursos";
	}

}
