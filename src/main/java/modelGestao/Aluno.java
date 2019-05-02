package modelGestao;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class Aluno extends Usuario {
	
	private Curso cursoAluno;
	private List<Turma> listaTurmasAluno =  new ArrayList<Turma>();
	private List<Avaliacao> listaAvaliacoesAluno = new ArrayList<Avaliacao>();
	private List<Campus> listaCampusAluno = new ArrayList<Campus>();
	
	public Aluno(long idUsuario, String nome, String sobrenome, String endereco, String cpf, LocalDate data,
			String email, long matricula) {
		super(idUsuario, nome, sobrenome, endereco, cpf, data, email, matricula);
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
