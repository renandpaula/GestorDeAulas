package br.edu.ucsal.gestordeaulas.models;

import java.io.Serializable;

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
	
	private String nome;
	private long cnpj;
	private String endereco;
	private int telefone;
	
	
	public Instituicao(String nome, long cnpj, String endereco, int telefone) {
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
	
	public long getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
		

}
