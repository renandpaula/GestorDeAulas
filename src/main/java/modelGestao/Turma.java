package modelGestao;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private Sala salaTurma;
	private Disciplina disciplinaTurma;
	private List<Aluno> listaAlunosTurma = new ArrayList<Aluno>();
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
