package modelGestao;

import org.joda.time.LocalDate;

public class Evento {
	
	private String nomeEvento;
	private LocalDate dataEvento;
	private String horarioEvento;
	private boolean diaUtilEvento;
	
	public Evento(String nomeEvento, LocalDate dataEvento, String horarioEvento, boolean diaUtilEvento) {
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.horarioEvento = horarioEvento;
		this.diaUtilEvento = diaUtilEvento;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
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
