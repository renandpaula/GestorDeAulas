package modelGestao;

import java.util.ArrayList;
import java.util.List;

public class Campus extends Instituicao {
	
	private List<Curso> listaCursosCampus = new ArrayList<Curso>();
	private List<Professor> listaProfessoresCampus = new ArrayList<Professor>();
	private List<Aluno> listaAlunosCampus = new ArrayList<Aluno>();
	private List<Disciplina> listaDisciplinasCampus = new ArrayList<Disciplina>();
	private List<Sala> listaSalasCampus = new ArrayList<Sala>();
	private CalendarioAcademico calendarioAcademico;
	
	public Campus(String nome, long cnpj, String endereco, int telefone) {
		super(nome, cnpj, endereco, telefone);
	}

	public List<Curso> getListaCursos() {
		return listaCursosCampus;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursosCampus = listaCursos;
	}
	
	public void addListaCursos(Curso curso) {
		this.listaCursosCampus.add(curso);
	}

	public List<Professor> getListaProfessores() {
		return listaProfessoresCampus;
	}

	public void setListaProfessores(List<Professor> listaProfessores) {
		this.listaProfessoresCampus = listaProfessores;
	}
	
	public void addListaProfessores(Professor professor) {
		this.listaProfessoresCampus.add(professor);
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunosCampus;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunosCampus = listaAlunos;
	}
	
	public void addListaAlunos(Aluno aluno) {
		this.listaAlunosCampus.add(aluno);
	}

	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinasCampus;
	}

	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinasCampus = listaDisciplinas;
	}

	public void addListaDisciplinas(Disciplina disciplina) {
		this.listaDisciplinasCampus.add(disciplina);
	}

	public List<Sala> getListaSalas() {
		return listaSalasCampus;
	}

	public void setListaSalas(List<Sala> listaSalas) {
		this.listaSalasCampus = listaSalas;
	}
	
	public void addListaSalas(Sala sala) {
		this.listaSalasCampus.add(sala);
	}

	public CalendarioAcademico getCalendarioAcademico() {
		return calendarioAcademico;
	}

	public void setCalendarioAcademico(CalendarioAcademico calendarioAcademico) {
		this.calendarioAcademico = calendarioAcademico;
	}
	
	
	
}
