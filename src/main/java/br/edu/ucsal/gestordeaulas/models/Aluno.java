package br.edu.ucsal.gestordeaulas.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aluno extends Usuario {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3302989573699184657L;
	@ManyToOne(targetEntity=Curso.class, fetch=FetchType.EAGER)
	private Curso cursoAluno;
	@OneToMany(targetEntity=Turma.class, mappedBy="listaAlunosTurma", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Turma> listaTurmasAluno =  new ArrayList<Turma>();
	@OneToMany(targetEntity=Avaliacao.class, mappedBy="alunoAvaliacao", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Avaliacao> listaAvaliacoesAluno = new ArrayList<Avaliacao>();
	@OneToMany(targetEntity=Campus.class, mappedBy="listaAlunosCampus", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Campus> listaCampusAluno = new ArrayList<Campus>();
	
	public Aluno(String nome, String sobrenome, String endereco, String cpf, String data,
			String email, long matricula) {
		super(nome, sobrenome, endereco, cpf, data, email, matricula);
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
