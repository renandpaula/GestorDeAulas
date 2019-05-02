package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evento implements Serializable {
	
	private static final long serialVersionUID = -6158242506887824470L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long idEvento;
	
	private String nomeEvento;
	private String dataEvento;
	private String horarioEvento;
	
	@Column(nullable=false)
	private Campus localEvento;
	
	@ManyToOne
	@JoinColumn(name="calendarioAcademico", nullable=false)
	private CalendarioAcademico calendarioAcademico;
	
	private boolean diaUtilEvento;
	private boolean feriado;
	
	public Evento(String nomeEvento, String dataEvento, String horarioEvento, Campus localEvento,
			CalendarioAcademico calendarioAcademico, boolean diaUtilEvento, boolean feriado) {
		super();
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.horarioEvento = horarioEvento;
		this.localEvento = localEvento;
		this.calendarioAcademico = calendarioAcademico;
		this.diaUtilEvento = diaUtilEvento;
		this.feriado = feriado;
	}



	public Evento() {
		
	}
	
	public CalendarioAcademico getCalendarioAcademico() {
		return calendarioAcademico;
	}
	
	public void setCalendarioAcademico(CalendarioAcademico calendarioAcademico) {
		this.calendarioAcademico = calendarioAcademico;
	}

	public boolean isFeriado() {
		return feriado;
	}

	public void setFeriado(boolean feriado) {
		this.feriado = feriado;
	}

	public Campus getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(Campus localEvento) {
		this.localEvento = localEvento;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
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
