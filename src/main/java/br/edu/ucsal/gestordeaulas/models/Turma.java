package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Turma implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 56495796384545507L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idTurma;
	
	private Sala salaTurma;
	private Disciplina disciplinaTurma;
	@ManyToMany(targetEntity=Aluno.class, fetch=FetchType.LAZY)
	private List<Aluno> listaAlunosTurma = new ArrayList<Aluno>();
	@ManyToOne(targetEntity=Professor.class, fetch=FetchType.LAZY)
	private Professor professorTurma;
	private Campus campusTurma;
	
	
	public Turma(Sala sala, Disciplina disciplina, List<Aluno> listaAlunosTurma, Professor professor, Campus campus) {
		this.salaTurma = sala;
		this.disciplinaTurma = disciplina;
		this.listaAlunosTurma = listaAlunosTurma;
		this.professorTurma = professor;
		this.campusTurma = campus;
	}
	
	public Turma(Sala sala, Disciplina disciplina, Professor professor, Campus campus) {
		this.salaTurma = sala;
		this.disciplinaTurma = disciplina;
		this.professorTurma = professor;
		this.campusTurma = campus;
	}

	public long getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(long idTurma) {
		this.idTurma = idTurma;
	}

	public Sala getSala() {
		return salaTurma;
	}

	public void setSala(Sala sala) {
		this.salaTurma = sala;
	}

	public Disciplina getDisciplina() {
		return disciplinaTurma;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplinaTurma = disciplina;
	}

	public List<Aluno> getListaAlunosTurma() {
		return listaAlunosTurma;
	}

	public void setListaAlunosTurma(List<Aluno> listaAlunosTurma) {
		this.listaAlunosTurma = listaAlunosTurma;
	}
	
	public void addListaAlunosTurma(Aluno aluno) {
		this.listaAlunosTurma.add(aluno);
	}

	public Professor getProfessor() {
		return professorTurma;
	}

	public void setProfessor(Professor professor) {
		this.professorTurma = professor;
	}

	public Campus getCampus() {
		return campusTurma;
	}

	public void setCampus(Campus campus) {
		this.campusTurma = campus;
	}
	
}
