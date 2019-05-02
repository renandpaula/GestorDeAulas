package modelGestao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Campus> listaCampusCurso = new ArrayList<Campus>();
	private List<Disciplina> listaDisciplinasCurso = new ArrayList<Disciplina>();
	private List<Aluno> listaAlunosCurso = new ArrayList<Aluno>();
	private List<Professor> listaProfessoresCurso = new ArrayList<Professor>();
	private String nomeCurso;
	private String idCurso;
	
	public Curso(List<Campus> listaCampusCurso, List<Disciplina> listaDisciplinasCurso, List<Aluno> listaAlunosCurso,
			List<Professor> listaProfessoresCurso, String nomeCurso, String idCurso) {
		super();
		this.listaCampusCurso = listaCampusCurso;
		this.listaDisciplinasCurso = listaDisciplinasCurso;
		this.listaAlunosCurso = listaAlunosCurso;
		this.listaProfessoresCurso = listaProfessoresCurso;
		this.nomeCurso = nomeCurso;
		this.idCurso = idCurso;
	}

	public Curso(String nomeCurso, String idCurso) {
		super();
		this.nomeCurso = nomeCurso;
		this.idCurso = idCurso;
	}

	public List<Campus> getListaCampusCurso() {
		return listaCampusCurso;
	}
	
	public void setListaCampusCurso(List<Campus> listaCampusCurso) {
		this.listaCampusCurso = listaCampusCurso;
	}
	
	public void addListaCampusCurso(Campus campus) {
		this.listaCampusCurso.add(campus);
	}

	public List<Disciplina> getListaDisciplinasCurso() {
		return listaDisciplinasCurso;
	}

	public void setListaDisciplinasCurso(List<Disciplina> listaDisciplinasCurso) {
		this.listaDisciplinasCurso = listaDisciplinasCurso;
	}
	
	public void addListaDisciplinasCurso(Disciplina disciplina) {
		this.listaDisciplinasCurso.add(disciplina);
	}

	public List<Aluno> getListaAlunosCurso() {
		return listaAlunosCurso;
	}

	public void setListaAlunosCurso(List<Aluno> listaAlunosCurso) {
		this.listaAlunosCurso = listaAlunosCurso;
	}
	
	public void addListaAlunosCurso(Aluno aluno) {
		this.listaAlunosCurso.add(aluno);
	}

	public List<Professor> getListaProfessoresCurso() {
		return listaProfessoresCurso;
	}

	public void setListaProfessoresCurso(List<Professor> listaProfessoresCurso) {
		this.listaProfessoresCurso = listaProfessoresCurso;
	}
	
	public void addListaProfessoresCurso(Professor professor) {
		this.listaProfessoresCurso.add(professor);
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	
}
