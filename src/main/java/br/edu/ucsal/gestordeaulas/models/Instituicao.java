package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instituicao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7236787832657432989L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idInstitucao;
	
	@Column(length=50, nullable=false)
	private String nome;
	@Column(length=14, nullable=false)
	private String cnpj;
	@Column(length=50, nullable=false)
	private String endereco;
	@Column(length=11, nullable=false)
	private String telefone;
	
	
	public Instituicao(String nome, String cnpj, String endereco, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public long getIdInstitucao() {
		return idInstitucao;
	}

	public void setIdInstitucao(long idInstitucao) {
		this.idInstitucao = idInstitucao;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		

}
