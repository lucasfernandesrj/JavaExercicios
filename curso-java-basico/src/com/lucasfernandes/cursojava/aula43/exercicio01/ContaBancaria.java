package com.lucasfernandes.cursojava.aula43.exercicio01;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public boolean sacar(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo+=valor;
			return true;
		}
		return false;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Nome: "+this.getNomeCliente()+"\n"
				+"Conta: "+this.getNumConta()+"\n"
				+"Saldo: R$"+this.getSaldo();
	}
}
