package modelGestao;

public class Avaliacao {
	
	private Aluno alunoAvaliacao;
	private Turma turmaAvaliacao;
	private double notaAvaliacao;
	
	public Avaliacao(Aluno aluno, Turma turma, double nota) {
		this.alunoAvaliacao = aluno;
		this.turmaAvaliacao = turma;
		this.notaAvaliacao = nota;
	}

	public Aluno getAluno() {
		return alunoAvaliacao;
	}

	public void setAluno(Aluno aluno) {
		this.alunoAvaliacao = aluno;
	}

	public Turma getTurma() {
		return turmaAvaliacao;
	}

	public void setTurma(Turma turma) {
		this.turmaAvaliacao = turma;
	}

	public double getNota() {
		return notaAvaliacao;
	}

	public void setNota(double nota) {
		this.notaAvaliacao = nota;
	}
	
}
