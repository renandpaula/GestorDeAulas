package br.edu.ucsal.gestordeaulas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ucsal.gestordeaulas.models.Campus;
import br.edu.ucsal.gestordeaulas.repository.CampusRepository;

@Controller
public class campusController {
	
	@Autowired
	private CampusRepository cr;
	
	@RequestMapping(value="/cadastrarCampus", method=RequestMethod.GET)
	public String formCurso() {
		return "campus/cadastrarCampus";
	}
	
	@RequestMapping(value="/cadastrarCampus", method=RequestMethod.POST)
	public String formCurso(Campus campus) {
		 
		cr.save(campus);
		
		return "redirect:/cadastrarCampus";
	}

}
