package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Curso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8461523039739308715L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idCurso;
	
	@ManyToOne
	@JoinColumn(name="campusCurso", nullable=false)
	private Campus campusCurso;
	
	@OneToMany(mappedBy="cursoDisciplina", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Disciplina> listaDisciplinasCurso = new ArrayList<Disciplina>();
	
	@OneToMany(mappedBy="cursoAluno", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Aluno> listaAlunosCurso = new ArrayList<Aluno>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="curso_professor",
				joinColumns = @JoinColumn(name = "idCurso"),
				inverseJoinColumns = @JoinColumn(name = "idUsuario"))
	private List<Professor> listaProfessoresCurso = new ArrayList<Professor>();
	
	private String nomeCurso;
	
	public Curso(Campus campusCurso, List<Disciplina> listaDisciplinasCurso, List<Aluno> listaAlunosCurso,
			List<Professor> listaProfessoresCurso, String nomeCurso) {
		super();
		this.campusCurso = campusCurso;
		this.listaDisciplinasCurso = listaDisciplinasCurso;
		this.listaAlunosCurso = listaAlunosCurso;
		this.listaProfessoresCurso = listaProfessoresCurso;
		this.nomeCurso = nomeCurso;
	}

	public Curso(String nomeCurso, String idCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

	public Campus getCampusCurso() {
		return campusCurso;
	}
	
	public void setCampusCurso(Campus campusCurso) {
		this.campusCurso = campusCurso;
	}
	
	public List<Disciplina> getListaDisciplinasCurso() {
		return listaDisciplinasCurso;
	}

	public void setListaDisciplinasCurso(List<Disciplina> listaDisciplinasCurso) {
		this.listaDisciplinasCurso = listaDisciplinasCurso;
	}
	
	public void addListaDisciplinasCurso(Disciplina disciplina) {
		this.listaDisciplinasCurso.add(disciplina);
	}

	public List<Aluno> getListaAlunosCurso() {
		return listaAlunosCurso;
	}

	public void setListaAlunosCurso(List<Aluno> listaAlunosCurso) {
		this.listaAlunosCurso = listaAlunosCurso;
	}
	
	public void addListaAlunosCurso(Aluno aluno) {
		this.listaAlunosCurso.add(aluno);
	}

	public List<Professor> getListaProfessoresCurso() {
		return listaProfessoresCurso;
	}

	public void setListaProfessoresCurso(List<Professor> listaProfessoresCurso) {
		this.listaProfessoresCurso = listaProfessoresCurso;
	}
	
	public void addListaProfessoresCurso(Professor professor) {
		this.listaProfessoresCurso.add(professor);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
	
}
