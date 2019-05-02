package modelGestao;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class CalendarioAcademico {
	
	private List<LocalDate> datasCalendario = new ArrayList<LocalDate>();
	private List<Evento> listaDeEventosCalendario =  new ArrayList<Evento>();
	private Campus campusCalendario;
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
