package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Evento implements Serializable {
	
	private static final long serialVersionUID = -6158242506887824470L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idEvento;
	
	private String nomeEvento;
	@Temporal(TemporalType.DATE)
	private Date dataEvento;
	private String horarioEvento;
	
	@Column(nullable=false)
	private Campus localEvento;
	
	@ManyToOne
	@JoinColumn(name="calendarioAcademico", nullable=false)
	private CalendarioAcademico calendarioAcademico;
	
	private boolean diaUtilEvento;
	private boolean feriado;
	
	public Evento(String nomeEvento, Date dataEvento, String horarioEvento, Campus localEvento,
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
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
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
