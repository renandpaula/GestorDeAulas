package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao implements Serializable{
	
	private static final long serialVersionUID = -3662344044559747722L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idAvaliacao;
	
	@ManyToOne
	@JoinColumn(name="alunoAvaliacao", nullable=false)
	private Aluno alunoAvaliacao;
	
	@ManyToOne
	@JoinColumn(name="turmaAvaliacao", nullable=false)
	private Turma turmaAvaliacao;
	
	@Column(length=2, precision=1, nullable=false)
	private double notaAvaliacao;
	
	public Avaliacao(Aluno aluno, Turma turma, double nota) {
		this.alunoAvaliacao = aluno;
		this.turmaAvaliacao = turma;
		this.notaAvaliacao = nota;
	}
	
	public Long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public Aluno getAluno() {
		return alunoAvaliacao;
	}

	public void setAluno(Aluno aluno) {
		this.alunoAvaliacao = aluno;
	}

	public Turma getTurma() {
		return turmaAvaliacao;
	}

	public void setTurma(Turma turma) {
		this.turmaAvaliacao = turma;
	}

	public double getNota() {
		return notaAvaliacao;
	}

	public void setNota(double nota) {
		this.notaAvaliacao = nota;
	}
	
}
