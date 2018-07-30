package com.lucasfernandes.cursojava.aula25;

public class Exercicio02ContaCorrente {
	int numero;
	double saldo;
	boolean especial = false;
	double limite;
	
	public void realizarSaque(double valor) {
		if(saldo <= valor || valor > 0) {
			saldo-=valor;
		}else {
			System.out.println("Valor de saque inválido!");
		}
	}
	
	public void depositarDinheiro(double valor) {
		saldo+=valor;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo Atual: "+saldo);
	}
	
	public void verificarClienteEspecial() {
		if(especial) {
			System.out.println("Cheque Especial - Limite: "+limite);
		}else {
			System.out.println("Não está usando o Cheque Especial!");
		}
	}
}
