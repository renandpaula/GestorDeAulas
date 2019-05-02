package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Serializable{
	
	private static final long serialVersionUID = 56495796384545507L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idTurma;
	
	@ManyToOne
	@JoinColumn(name="salaTurma", nullable=false)
	private Sala salaTurma;

	@ManyToOne
	@JoinColumn(name="disciplinaTurma", nullable=false)
	private Disciplina disciplinaTurma;
	
	@ManyToMany(mappedBy="listaTurmasAluno", cascade=CascadeType.ALL)
	private List<Aluno> listaAlunosTurma = new ArrayList<Aluno>();
	
	@ManyToOne
	@JoinColumn(name="professorTurma", nullable=false)
	private Professor professorTurma;
	
	@Column(nullable=false)
	private Campus campusTurma;
	
	@OneToMany(mappedBy="turmaAvaliacao", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
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
	
	public Turma() {
		
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
