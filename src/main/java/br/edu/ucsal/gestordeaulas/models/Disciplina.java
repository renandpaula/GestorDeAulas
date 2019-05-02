package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Disciplina implements Serializable{
	
	private static final long serialVersionUID = -5793463018473496771L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idDisciplina;
	
	@ManyToOne
	@JoinColumn(name="professorDisciplina", nullable=false)
	private Professor professorDisciplina;
	
	@ManyToOne
	@JoinColumn(name="cursoDisciplina", nullable=false)
	private Curso cursoDisciplina;
	
	@Column
	private Campus campusDisciplina =  cursoDisciplina.getCampusCurso();
	
	@OneToMany(mappedBy="disciplinaTurma", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Turma> listaTurmasDisciplina = new ArrayList<Turma>();
	
	@OneToMany(mappedBy="disciplinaAssunto", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Assunto> listaAssuntosDisciplina = new ArrayList<Assunto>();
	
	private int cargaHorariaDisciplina;
	private String diaDaSemanaDisciplina;
	private String horarioDisciplina;
	
	public Disciplina(Professor professorDisciplina, Curso cursoDisciplina, List<Turma> listaTurmasDisciplina, List<Assunto> listaAssuntosDisciplina, int cargaHorariaDisciplina,
			String diaDaSemanaDisciplina, String horarioDisciplina) {
		super();
		this.professorDisciplina = professorDisciplina;
		this.cursoDisciplina = cursoDisciplina;
		this.listaTurmasDisciplina = listaTurmasDisciplina;
		this.listaAssuntosDisciplina = listaAssuntosDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
		this.diaDaSemanaDisciplina = diaDaSemanaDisciplina;
		this.horarioDisciplina = horarioDisciplina;
	}
	
	public Disciplina(Curso cursoDisciplina, List<Assunto> listaAssuntosDisciplina,
			int cargaHorariaDisciplina) {
		super();
		this.cursoDisciplina = cursoDisciplina;
		this.listaAssuntosDisciplina = listaAssuntosDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}
	
	public Campus getListaCampusDisciplina() {
		return campusDisciplina;
	}

	public void setListaCampusDisciplina(Campus campusDisciplina) {
		this.campusDisciplina = campusDisciplina;
	}

	public long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(long idDisciplina) {
		this.idDisciplina = idDisciplina;
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

	public Curso getCursoDisciplina() {
		return cursoDisciplina;
	}

	public void setCursoDisciplina(Curso cursoDisciplina) {
		this.cursoDisciplina = cursoDisciplina;
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
