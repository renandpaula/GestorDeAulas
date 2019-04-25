package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3662344044559747722L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idAvaliacao;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Aluno alunoAvaliacao;
	@ManyToOne(fetch=FetchType.EAGER)
	private Turma turmaAvaliacao;
	private double notaAvaliacao;
	
	public Avaliacao(Aluno aluno, Turma turma, double nota) {
		this.alunoAvaliacao = aluno;
		this.turmaAvaliacao = turma;
		this.notaAvaliacao = nota;
	}
	
	public long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(long idAvaliacao) {
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
