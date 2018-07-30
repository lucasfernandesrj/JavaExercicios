package com.lucasfernandes.cursojava.aula33;

public class Exercicio02 {
	private int numero;
	private double saldo;
	private boolean especial = false;
	private double especialUsado = 0;
	private double especialLimite;
	
	
	
	public Exercicio02(int numero, double saldo, boolean especial, double especialUsado, double especialLimite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.especialUsado = especialUsado;
		this.especialLimite = especialLimite;
	}

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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getEspecialUsado() {
		return especialUsado;
	}

	public void setEspecialUsado(double especialUsado) {
		this.especialUsado = especialUsado;
	}

	public double getEspecialLimite() {
		return especialLimite;
	}

	public void setEspecialLimite(double especialLimite) {
		this.especialLimite = especialLimite;
	}
	
	
}
