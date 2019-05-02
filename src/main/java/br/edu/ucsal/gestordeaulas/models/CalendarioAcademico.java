package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


@Entity
public class CalendarioAcademico implements Serializable {
	
	private static final long serialVersionUID = -1813545341353580913L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idCalendario;
	
	
	@OneToMany(mappedBy="calendarioAcademico", fetch=FetchType.LAZY, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Evento> listaDeEventosCalendario =  new ArrayList<Evento>();
	
	@ManyToOne
	@JoinColumn(name="campusCalendario", nullable=false)
	private Campus campusCalendario;
	
	@Transient
	private List<Curso> listaCursos = campusCalendario.getListaCursos();
	
	@ElementCollection(targetClass=Disciplina.class)
	@CollectionTable(name = "listaDisciplinasCalendario",
						joinColumns = @JoinColumn(name="idDisciplina"))
	private List<Disciplina> listaDisciplinasCalendario = pegarListaDeDisciplinas(listaCursos);
	
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
	
		public List<Disciplina> pegarListaDeDisciplinas(List<Curso> listaCursos) {
		
		List<Disciplina> listaDisciplinasIterada = new ArrayList<>();
		
		for (Curso cursosLista : listaCursos) {
		 listaDisciplinasIterada.addAll(cursosLista.getListaDisciplinasCurso());
		}
		
		return listaDisciplinasIterada;
		
	}
	
	
	

}
