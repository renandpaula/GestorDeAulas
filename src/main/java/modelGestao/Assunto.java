package modelGestao;

public class Assunto {
	
	private String nomeAssunto;
	private Disciplina disciplinaAssunto;
	
	public Assunto(String nomeAssunto, Disciplina disciplinaAssunto) {
		super();
		this.nomeAssunto = nomeAssunto;
		this.disciplinaAssunto = disciplinaAssunto;
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
