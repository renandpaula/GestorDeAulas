package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "matricula")
	private Long idUsuario;
	
	@Column(length=20, nullable=false)
	private String nome;
	@Column(length=50, nullable=false)
	private String sobrenome;
	@Column(length=50, nullable=false)
	private String endereco;
	@Column(length=11, nullable=false)
	private String cpf;
	private String data;
	@Column(length=50)
	private String email;
	
	public Usuario(String nome, String sobrenome, String endereco, String cpf, String data,
			String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
	}
	
	public Long getMatricula() {
		return idUsuario;
	}

	public void setMatricula(Long idUsuario) {
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
