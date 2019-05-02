package modelGestao;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	
	private Campus campusSala;
	private String numeroSala;
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
