package com.banco2;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String rg;
	private String dataDeNascimento;
	private String telefone;
	private String endereco;
		
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String rg, String dataDeNascimento, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataDeNascimento=" + dataDeNascimento
				+ ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	
	
}
