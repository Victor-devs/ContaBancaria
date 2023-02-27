package com.banco2;

import java.math.BigDecimal;

public class ContaBancaria {

	private String agencia;
	private String conta;
	private BigDecimal saldo;
	
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String agencia, String conta, BigDecimal saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo (BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(BigDecimal valor) {
		this.saldo = saldo.add(valor);
	}
	
	public void sacar(BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
	}
}
