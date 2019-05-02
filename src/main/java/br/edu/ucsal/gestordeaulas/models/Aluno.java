package br.edu.ucsal.gestordeaulas.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aluno extends Usuario {
	
	private static final long serialVersionUID = -3302989573699184657L;
	@ManyToOne
	@JoinColumn(name="cursoAluno", nullable=false) 
	private Curso cursoAluno;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="aluno_turma",
				joinColumns = @JoinColumn(name = "idUsuario"),
				inverseJoinColumns = @JoinColumn(name = "idTurma"))
	private List<Turma> listaTurmasAluno =  new ArrayList<Turma>();
	
	@OneToMany(mappedBy="alunoAvaliacao", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Avaliacao> listaAvaliacoesAluno = new ArrayList<Avaliacao>();
	
	@ManyToMany(mappedBy="listaAlunosCampus", cascade=CascadeType.ALL)
	private List<Campus> listaCampusAluno = new ArrayList<Campus>();
	
	public Aluno(String nome, String sobrenome, String endereco, String cpf, Date data,
			String email) {
		super(nome, sobrenome, endereco, cpf, data, email);
	}
	
	public Curso getCurso() {
		return cursoAluno;
	}

	public void setCurso(Curso curso) {
		this.cursoAluno = curso;
	}
	
	public List<Turma> getListaTurmasAluno() {
		return listaTurmasAluno;
	}

	public void setListaTurmasAluno(List<Turma> listaTurmasAluno) {
		this.listaTurmasAluno = listaTurmasAluno;
	}
	
	public void addListaTurmasAluno(Turma turma) {
		this.listaTurmasAluno.add(turma);
	}

	public List<Avaliacao> getListaAvaliacoesAluno() {
		return listaAvaliacoesAluno;
	}

	public void setListaAvaliacoesAluno(List<Avaliacao> listaAvaliacoesAluno) {
		this.listaAvaliacoesAluno = listaAvaliacoesAluno;
	}
	
	public void addListaAvaliacoesAluno(Avaliacao avaliacao) {
		this.listaAvaliacoesAluno.add(avaliacao);
	}

	public List<Campus> getListaCampusAluno() {
		return listaCampusAluno;
	}

	public void setListaCampusAluno(List<Campus> listaCampusAluno) {
		this.listaCampusAluno = listaCampusAluno;
	}
	
	public void addListaCampusAluno(Campus campus) {
		this.listaCampusAluno.add(campus);
	}

}
