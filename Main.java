package com.banco2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	
	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		
//		cliente.setNome("Maria");
//		cliente.setCpf("000.111.222-33");
//		cliente.setRg("444555-5");
//		cliente.setDataDeNascimento ("01/01/2001");
//		cliente.setTelefone("(99)00001-0002");
//		cliente.setEndereco("Rua dos alfeneiros");
//		
//		
//		ContaBancaria contaBancaria = new ContaBancaria();
//		
//		contaBancaria.setAgencia("2525");
//		contaBancaria.setConta("3333");
//		contaBancaria.setSaldo(new BigDecimal(1000));
//		contaBancaria.depositar(new BigDecimal(1500));
//		contaBancaria.sacar(new BigDecimal(350));
		
		Cliente cliente = new Cliente("Maria", "000.111.222-33", "444555-5","01/01/2001", "(99) 00001-0002", "Rua dos alfeneiros");
		ContaBancaria contaBancaria = new ContaBancaria("2525", "3333", new BigDecimal(1000));
		
		System.out.println("======================= Dados do Cliente =======================");
		System.out.println("Cliente: " + cliente.getNome() + "\n" + "Cpf: " + cliente.getCpf() + "\n" + "Rg: " + cliente.getRg() + "\n" + 
		"Data de Nascimento: " + cliente.getDataDeNascimento() + "\n" + "Telefone: "+ cliente.getTelefone() + "\n" + "Endereco: " + cliente.getEndereco() + "\n");
		
		System.out.println("======================= Dados da Conta =======================");
		System.out.println("Agencia: " + contaBancaria.getAgencia() + "\n" + "Conta: " + contaBancaria.getConta() + "\n" +
		"Saldo: " + contaBancaria.getSaldo().setScale(2, RoundingMode.HALF_UP));
		
	}
	
	
}
