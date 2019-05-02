package br.edu.ucsal.gestordeaulas.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ucsal.gestordeaulas.models.Campus;

public interface CampusRepository extends CrudRepository<Campus, String> {

}
