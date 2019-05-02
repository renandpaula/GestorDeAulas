package modelGestao;

import org.joda.time.LocalDate;

public class Usuario {
	
	private long idUsuario;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String cpf;
	private LocalDate data;
	private String email;
	private long matricula;
	
	public Usuario(long idUsuario, String nome, String sobrenome, String endereco, String cpf, LocalDate data,
			String email, long matricula) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
		this.matricula = matricula;
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	

}
