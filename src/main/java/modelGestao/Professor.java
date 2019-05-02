package modelGestao;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class Professor extends Usuario {
	
	private List<Disciplina> listaDisciplinasProfessor = new ArrayList<Disciplina>();
	private List<Turma> listaTurmasProfessor = new ArrayList<Turma>();
	private List<Campus> listaCampusProfessor =  new ArrayList<Campus>();
	

	public Professor(long idUsuario, String nome, String sobrenome, String endereco, String cpf, LocalDate data,
			String email, long matricula) {
		super(idUsuario, nome, sobrenome, endereco, cpf, data, email, matricula);
	}

	public List<Disciplina> getListaDisciplinasProfessor() {
		return listaDisciplinasProfessor;
	}

	public void setListaDisciplinasProfessor(List<Disciplina> listaDisciplinasProfessor) {
		this.listaDisciplinasProfessor = listaDisciplinasProfessor;
	}
	
	public void addListaDisciplinasProfessor(Disciplina disciplina) {
		this.listaDisciplinasProfessor.add(disciplina);
	}

	public List<Turma> getListaTurmasProfessor() {
		return listaTurmasProfessor;
	}

	public void setListaTurmasProfessor(List<Turma> listaTurmasProfessor) {
		this.listaTurmasProfessor = listaTurmasProfessor;
	}

	public void addListaTurmaProfessor(Turma turma) {
		this.listaTurmasProfessor.add(turma);
	}

	public List<Campus> getListaCampusProfessor() {
		return listaCampusProfessor;
	}

	public void setListaCampusProfessor(List<Campus> listaCampusProfessor) {
		this.listaCampusProfessor = listaCampusProfessor;
	}
	
	public void addListaCampusProfessor(Campus campus) {
		this.listaCampusProfessor.add(campus);
	}

}
