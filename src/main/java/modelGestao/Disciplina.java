package modelGestao;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private Professor professorDisciplina;
	private List<Curso> listaCursosDisciplina = new ArrayList<Curso>();
	private List<Turma> listaTurmasDisciplina = new ArrayList<Turma>();
	private List<Assunto> listaAssuntosDisciplina = new ArrayList<Assunto>();
	private int cargaHorariaDisciplina;
	private String diaDaSemanaDisciplina;
	private String horarioDisciplina;
	
	
	
	public Disciplina(Professor professorDisciplina, List<Curso> listaCursosDisciplina,
			List<Turma> listaTurmasDisciplina, List<Assunto> listaAssuntosDisciplina, int cargaHorariaDisciplina,
			String diaDaSemanaDisciplina, String horarioDisciplina) {
		super();
		this.professorDisciplina = professorDisciplina;
		this.listaCursosDisciplina = listaCursosDisciplina;
		this.listaTurmasDisciplina = listaTurmasDisciplina;
		this.listaAssuntosDisciplina = listaAssuntosDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
		this.diaDaSemanaDisciplina = diaDaSemanaDisciplina;
		this.horarioDisciplina = horarioDisciplina;
	}
	
	

	public Disciplina(List<Curso> listaCursosDisciplina, List<Assunto> listaAssuntosDisciplina,
			int cargaHorariaDisciplina) {
		super();
		this.listaCursosDisciplina = listaCursosDisciplina;
		this.listaAssuntosDisciplina = listaAssuntosDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}



	public String getDiaDaSemanaDisciplina() {
		return diaDaSemanaDisciplina;
	}

	public void setDiaDaSemanaDisciplina(String diaDaSemanaDisciplina) {
		this.diaDaSemanaDisciplina = diaDaSemanaDisciplina;
	}

	public String getHorarioDisciplina() {
		return horarioDisciplina;
	}

	public void setHorarioDisciplina(String horarioDisciplina) {
		this.horarioDisciplina = horarioDisciplina;
	}

	public Professor getProfessorDisciplina() {
		return professorDisciplina;
	}

	public void setProfessorDisciplina(Professor professorDisciplina) {
		this.professorDisciplina = professorDisciplina;
	}

	public List<Curso> getListaCursosDisciplina() {
		return listaCursosDisciplina;
	}

	public void setListaCursosDisciplina(List<Curso> listaCursosDisciplina) {
		this.listaCursosDisciplina = listaCursosDisciplina;
	}
	
	public void addListaCursosDisciplina(Curso curso) {
		this.listaCursosDisciplina.add(curso);
	}

	public List<Turma> getListaTurmasDisciplina() {
		return listaTurmasDisciplina;
	}

	public void setListaTurmasDisciplina(List<Turma> listaTurmasDisciplina) {
		this.listaTurmasDisciplina = listaTurmasDisciplina;
	}
	
	public void addlistaTurmasDisciplinas(Turma turma) {
		this.listaTurmasDisciplina.add(turma);
	}
	
	public List<Assunto> getListaAssuntosDisciplina() {
		return listaAssuntosDisciplina;
	}

	public void setListaAssuntosDisciplina(List<Assunto> listaAssuntosDisciplina) {
		this.listaAssuntosDisciplina = listaAssuntosDisciplina;
	}

	public int getCargaHorariaDisciplina() {
		return cargaHorariaDisciplina;
	}

	public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}

	
}
