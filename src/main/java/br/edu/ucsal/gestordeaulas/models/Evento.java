package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6158242506887824470L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idEvento;
	
	private String nomeEvento;
	private String dataEvento;
	private String horarioEvento;
	private String localEvento;
	private boolean diaUtilEvento;
	
	public Evento(String nomeEvento, String dataEvento, String horarioEvento, boolean diaUtilEvento, String localEvento) {
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.horarioEvento = horarioEvento;
		this.diaUtilEvento = diaUtilEvento;
		this.localEvento = localEvento;
	}
	
	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getHorarioEvento() {
		return horarioEvento;
	}
	public void setHorarioEvento(String horarioEvento) {
		this.horarioEvento = horarioEvento;
	}
	public boolean isDiaUtilEvento() {
		return diaUtilEvento;
	}
	public void setDiaUtilEvento(boolean diaUtilEvento) {
		this.diaUtilEvento = diaUtilEvento;
	}
	
	

}
