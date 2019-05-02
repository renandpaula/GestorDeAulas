package br.edu.ucsal.gestordeaulas.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Campus extends Instituicao {
	
	private static final long serialVersionUID = 8090960602122686439L;
	
	@OneToMany(mappedBy="campusCurso", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Curso> listaCursosCampus = new ArrayList<Curso>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="campus_professor",
				joinColumns = @JoinColumn(name = "idInstitucao"),
				inverseJoinColumns = @JoinColumn(name = "idUsuario"))
	private List<Professor> listaProfessoresCampus = new ArrayList<Professor>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="campus_aluno",
				joinColumns = @JoinColumn(name = "idInstitucao"),
				inverseJoinColumns = @JoinColumn(name = "idUsuario"))
	private List<Aluno> listaAlunosCampus = new ArrayList<Aluno>();
	
	@OneToMany(mappedBy="campusSala", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Sala> listaSalasCampus = new ArrayList<Sala>();
	
	@OneToMany(mappedBy="campusCalendario", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<CalendarioAcademico> listaCalendarioAcademico = new ArrayList<CalendarioAcademico>();
	
	public Campus(String nome, String cnpj, String endereco, String telefone) {
		super(nome, cnpj, endereco, telefone);
	}

	public List<Curso> getListaCursos() {
		return listaCursosCampus;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursosCampus = listaCursos;
	}
	
	public void addListaCursos(Curso curso) {
		this.listaCursosCampus.add(curso);
	}

	public List<Professor> getListaProfessores() {
		return listaProfessoresCampus;
	}

	public void setListaProfessores(List<Professor> listaProfessores) {
		this.listaProfessoresCampus = listaProfessores;
	}
	
	public void addListaProfessores(Professor professor) {
		this.listaProfessoresCampus.add(professor);
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunosCampus;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunosCampus = listaAlunos;
	}
	
	public void addListaAlunos(Aluno aluno) {
		this.listaAlunosCampus.add(aluno);
	}

	public List<Sala> getListaSalas() {
		return listaSalasCampus;
	}

	public void setListaSalas(List<Sala> listaSalas) {
		this.listaSalasCampus = listaSalas;
	}
	
	public void addListaSalas(Sala sala) {
		this.listaSalasCampus.add(sala);
	}

	public List<CalendarioAcademico> getCalendarioAcademico() {
		return listaCalendarioAcademico;
	}

	public void setCalendarioAcademico(List<CalendarioAcademico> calendarioAcademico) {
		this.listaCalendarioAcademico = calendarioAcademico;
	}
	
	
	
}
