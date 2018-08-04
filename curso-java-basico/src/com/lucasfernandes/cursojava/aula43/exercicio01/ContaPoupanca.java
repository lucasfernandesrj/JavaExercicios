package com.lucasfernandes.cursojava.aula43.exercicio01;

public class ContaPoupanca extends ContaBancaria {
	private double diaRendimento;
	
	public void calcularNovoSaldo() {
		this.setSaldo(this.getSaldo()+((this.getSaldo() * diaRendimento)/100));
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public String toString() {
		return "Nome: "+this.getNomeCliente()+" - "
				+"Conta: "+this.getNumConta()+" - "
				+"Saldo: R$"+this.getSaldo()+" - "
				+"Rendimento: R$"+this.getDiaRendimento();
	}
}
