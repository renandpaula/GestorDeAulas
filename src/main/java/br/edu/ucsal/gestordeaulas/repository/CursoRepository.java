package br.edu.ucsal.gestordeaulas.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ucsal.gestordeaulas.models.Curso;

public interface CursoRepository extends CrudRepository<Curso, String> {

}
