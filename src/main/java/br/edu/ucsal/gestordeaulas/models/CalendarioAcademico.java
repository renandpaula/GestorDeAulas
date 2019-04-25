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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.joda.time.LocalDate;

@Entity
public class CalendarioAcademico implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1813545341353580913L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idCalendario;
	
	private List<LocalDate> datasCalendario = new ArrayList<LocalDate>();
	@OneToMany(targetEntity=Evento.class, mappedBy="dataEvento", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Evento> listaDeEventosCalendario =  new ArrayList<Evento>();
	@ManyToOne(targetEntity=Campus.class)
	private Campus campusCalendario;
	@SuppressWarnings("unused")
	private List<Disciplina> listaDisciplinasCalendario = campusCalendario.getListaDisciplinas();
	
	public CalendarioAcademico(List<LocalDate> datasCalendario, List<Evento> listaDeEventosCalendario,
			Campus campusCalendario) {
		super();
		this.datasCalendario = datasCalendario;
		this.listaDeEventosCalendario = listaDeEventosCalendario;
		this.campusCalendario = campusCalendario;
	}
	
	
	public CalendarioAcademico(List<Evento> listaDeEventosCalendario, Campus campusCalendario) {
		super();
		this.listaDeEventosCalendario = listaDeEventosCalendario;
		this.campusCalendario = campusCalendario;
	}


	public List<Evento> getListaDeEventosCalendario() {
		return listaDeEventosCalendario;
	}
	
	public void setListaDeEventosCalendario(List<Evento> listaDeEventosCalendario) {
		this.listaDeEventosCalendario = listaDeEventosCalendario;
	}
	
	public void addListaEventosCalendario(Evento evento) {
		this.listaDeEventosCalendario.add(evento);
	}
	
	public Campus getCampusCalendario() {
		return campusCalendario;
	}
	
	public void setCampusCalendario(Campus campusCalendario) {
		this.campusCalendario = campusCalendario;
	}
	
	public List<LocalDate> getDatasCalendario() {
		return datasCalendario;
	}
	
	

}
