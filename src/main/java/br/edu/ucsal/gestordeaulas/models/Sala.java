package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sala implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4357567894130964018L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idSala;
	
	@ManyToOne
	@JoinColumn(name="campusSala", nullable=false)
	private Campus campusSala;
	
	private String numeroSala;
	
	@OneToMany(mappedBy="salaTurma", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Turma> listaTurmasSala = new ArrayList<Turma>();
	
	public Sala(Campus campus, String numero, List<Turma> listaTurmasSala) {
		super();
		this.campusSala = campus;
		this.numeroSala = numero;
		this.listaTurmasSala = listaTurmasSala;
	}

	public Sala(Campus campus, String numero) {
		super();
		this.campusSala = campus;
		this.numeroSala = numero;
	}

	public long getIdSala() {
		return idSala;
	}

	public void setIdSala(long idSala) {
		this.idSala = idSala;
	}

	public Campus getCampus() {
		return campusSala;
	}

	public void setCampus(Campus campus) {
		this.campusSala = campus;
	}

	public String getNumero() {
		return numeroSala;
	}

	public void setNumero(String numero) {
		this.numeroSala = numero;
	}

	public List<Turma> getListaTurmasSala() {
		return listaTurmasSala;
	}

	public void setListaTurmasSala(List<Turma> listaTurmasSala) {
		this.listaTurmasSala = listaTurmasSala;
	}
	
	public void addListaTurmasSala(Turma turma) {
		this.listaTurmasSala.add(turma);
	}
	

}
