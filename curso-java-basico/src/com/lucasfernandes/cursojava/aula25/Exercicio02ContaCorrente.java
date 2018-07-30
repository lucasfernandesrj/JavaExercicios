package com.lucasfernandes.cursojava.aula25;

public class Exercicio02ContaCorrente {
	int numero;
	double saldo;
	boolean especial = false;
	double especialUsado = 0;
	double especialLimite;
	
	public boolean realizarSaque(double valor) {
		if(saldo <= valor || valor > 0) {
			saldo-=valor;
			return true;
		}else if(especial){
			if((saldo + especialLimite) <= valor) {
				valor -= saldo;
				saldo = 0;
				especialLimite -= valor;
				return true;
			}else {
				return false;
			}
		}else{
			return false;
		}
	}
	
	public void depositarDinheiro(double valor) {
		saldo+=valor;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo Atual: "+saldo);
	}
	
	public void verificarClienteEspecial() {
		if(especial || saldo == 0) {
			System.out.println("Cheque Especial - Limite: "+especialLimite);
		}else {
			System.out.println("Não está usando o Cheque Especial!");
		}
	}
}
