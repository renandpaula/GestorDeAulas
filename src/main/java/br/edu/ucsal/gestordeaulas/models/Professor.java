package br.edu.ucsal.gestordeaulas.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Usuario {

	private static final long serialVersionUID = -4488262980914326041L;
	
	@OneToMany(mappedBy="professorDisciplina", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Disciplina> listaDisciplinasProfessor = new ArrayList<Disciplina>();
	
	@OneToMany(mappedBy="professorTurma", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Turma> listaTurmasProfessor = new ArrayList<Turma>();
	
	@ManyToMany(mappedBy="listaProfessoresCampus", cascade=CascadeType.ALL)
	private List<Campus> listaCampusProfessor =  new ArrayList<Campus>();
	
	@ManyToMany(mappedBy="listaProfessoresCurso", cascade=CascadeType.ALL)
	private List<Curso> listaCursosProfessor = new ArrayList<Curso>();
	

	public Professor(String nome, String sobrenome, String endereco, String cpf, String data,
			String email) {
		super(nome, sobrenome, endereco, cpf, data, email);
	}

	public List<Curso> getListaCursosProfessor() {
		return listaCursosProfessor;
	}

	public void setListaCursosProfessor(List<Curso> listaCursosProfessor) {
		this.listaCursosProfessor = listaCursosProfessor;
	}

	public List<Disciplina> getListaDisciplinasProfessor() {
		return listaDisciplinasProfessor;
	}

	public void setListaDisciplinasProfessor(List<Disciplina> listaDisciplinasProfessor) {
		this.listaDisciplinasProfessor = listaDisciplinasProfessor;
	}
	
	public void addListaDisciplinasProfessor(Disciplina disciplina) {
		this.listaDisciplinasProfessor.add(disciplina);
	}

	public List<Turma> getListaTurmasProfessor() {
		return listaTurmasProfessor;
	}

	public void setListaTurmasProfessor(List<Turma> listaTurmasProfessor) {
		this.listaTurmasProfessor = listaTurmasProfessor;
	}

	public void addListaTurmaProfessor(Turma turma) {
		this.listaTurmasProfessor.add(turma);
	}

	public List<Campus> getListaCampusProfessor() {
		return listaCampusProfessor;
	}

	public void setListaCampusProfessor(List<Campus> listaCampusProfessor) {
		this.listaCampusProfessor = listaCampusProfessor;
	}
	
	public void addListaCampusProfessor(Campus campus) {
		this.listaCampusProfessor.add(campus);
	}

}
