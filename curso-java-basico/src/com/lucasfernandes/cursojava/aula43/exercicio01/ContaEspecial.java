package com.lucasfernandes.cursojava.aula43.exercicio01;

public class ContaEspecial extends ContaBancaria {
	double limite;
	
	public boolean sacar(double valor) {
		if(valor > 0) {
			if(valor <= this.getSaldo()) {
				this.setSaldo(this.getSaldo()-valor);;
				return true;
			}else if(valor <= this.getSaldo()+limite){
				valor-=this.getSaldo();
				this.setSaldo(0);
				limite-=valor;
				return true;
			}
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String toString() {
		return "Nome: "+this.getNomeCliente()+" - "
				+"Conta: "+this.getNumConta()+" - "
				+"Saldo: R$"+this.getSaldo()+" - "
				+"Limite: R$"+this.getLimite();
	}
	
}
