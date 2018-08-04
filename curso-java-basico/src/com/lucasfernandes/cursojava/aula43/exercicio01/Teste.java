package com.lucasfernandes.cursojava.aula43.exercicio01;

public class Teste {

	public static void main(String[] args) {
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Lucas Leandro de Lima");
		contaEspecial.setNumConta(123);
		contaEspecial.setSaldo(150);
		contaEspecial.setLimite(200);
		System.out.println(contaEspecial.toString());
		if(contaEspecial.depositar(50)) {
			System.out.println("Depositado!");
		}else {
			System.out.println("Falha no depósito.");
		}
		System.out.println("Saldo atual:R$"+contaEspecial.getSaldo());
		if(contaEspecial.sacar(500)) {
			System.out.println("Sacado!");
		}else {
			System.out.println("Falha no saque.");
		}
		System.out.println("Saldo atual: R$"+contaEspecial.getSaldo());
		if(contaEspecial.sacar(180)) {
			System.out.println("Sacado!");
		}else {
			System.out.println("Falha no saque.");
		}
		System.out.println("Saldo atual: R$"+contaEspecial.getSaldo());
		
		System.out.println();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Maria Joana Silva");
		contaPoupanca.setNumConta(321);
		contaPoupanca.setSaldo(500);
		contaPoupanca.setDiaRendimento(7.58);
		System.out.println(contaPoupanca.toString());
		
		contaPoupanca.calcularNovoSaldo();
		System.out.println("Novo Saldo: R$"+contaPoupanca.getSaldo());
	}
}
