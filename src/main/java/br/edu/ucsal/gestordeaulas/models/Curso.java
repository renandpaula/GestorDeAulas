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
	@OneToMany(targetEntity=Campus.class, mappedBy="listaCursosCampus", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Campus> listaCampusCurso = new ArrayList<Campus>();
	@OneToMany(targetEntity=Disciplina.class, mappedBy="listaCursosDisciplina", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Disciplina> listaDisciplinasCurso = new ArrayList<Disciplina>();
	@OneToMany(targetEntity=Aluno.class, mappedBy="cursoAluno", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Aluno> listaAlunosCurso = new ArrayList<Aluno>();
	
	private List<Professor> listaProfessoresCurso = new ArrayList<Professor>();
	private String nomeCurso;
	
	public Curso(List<Campus> listaCampusCurso, List<Disciplina> listaDisciplinasCurso, List<Aluno> listaAlunosCurso,
			List<Professor> listaProfessoresCurso, String nomeCurso) {
		super();
		this.listaCampusCurso = listaCampusCurso;
		this.listaDisciplinasCurso = listaDisciplinasCurso;
		this.listaAlunosCurso = listaAlunosCurso;
		this.listaProfessoresCurso = listaProfessoresCurso;
		this.nomeCurso = nomeCurso;
	}

	public Curso(String nomeCurso, String idCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

	public List<Campus> getListaCampusCurso() {
		return listaCampusCurso;
	}
	
	public void setListaCampusCurso(List<Campus> listaCampusCurso) {
		this.listaCampusCurso = listaCampusCurso;
	}
	
	public void addListaCampusCurso(Campus campus) {
		this.listaCampusCurso.add(campus);
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
