package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assunto implements Serializable{
	
	private static final long serialVersionUID = 3488417739332646233L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idAssunto;
	
	private String nomeAssunto;
	
	@ManyToOne
	@JoinColumn(name="disciplinaAssunto", nullable=false)
	private Disciplina disciplinaAssunto;
	
	public Assunto(String nomeAssunto, Disciplina disciplinaAssunto) {
		super();
		this.nomeAssunto = nomeAssunto;
		this.disciplinaAssunto = disciplinaAssunto;
	}
	
	public Long getIdAssunto() {
		return idAssunto;
	}

	public void setIdAssunto(Long idAssunto) {
		this.idAssunto = idAssunto;
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}
	
	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}
	
	public Disciplina getDisciplinaAssunto() {
		return disciplinaAssunto;
	}
	
	public void setDisciplinaAssunto(Disciplina disciplinaAssunto) {
		this.disciplinaAssunto = disciplinaAssunto;
	}
	
	

}
