package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idUsuario;
	
	@Column(length=20, nullable=false)
	private String nome;
	@Column(length=50, nullable=false)
	private String sobrenome;
	@Column(length=50, nullable=false)
	private String endereco;
	@Column(length=11, nullable=false)
	private String cpf;
	@Temporal(TemporalType.DATE)
	private Date data;
	@Column(length=50)
	private String email;
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long matricula;
	
	
	
	public Usuario(String nome, String sobrenome, String endereco, String cpf, Date data,
			String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
	}
	
	public long getId() {
		return idUsuario;
	}

	public void setId(long idUsuario) {
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
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

}
