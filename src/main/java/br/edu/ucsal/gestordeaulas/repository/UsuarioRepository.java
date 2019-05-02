package br.edu.ucsal.gestordeaulas.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ucsal.gestordeaulas.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
