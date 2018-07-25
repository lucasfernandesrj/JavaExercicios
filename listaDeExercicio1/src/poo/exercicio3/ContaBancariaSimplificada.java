package poo.exercicio3;

import corejava.Console;

public class ContaBancariaSimplificada {
	private static int numeroDaConta = 0;
	private int numero;
	private String nome, cpf, conta;
	private double saldo;
	
	public ContaBancariaSimplificada(String nome, String cpf, String conta, double saldo) {
		setNumero(++numeroDaConta);
		setNome(nome.toUpperCase());
		setCpf(cpf);
		setSaldo(saldo);
		setConta(conta.toUpperCase());
	}

	public ContaBancariaSimplificada() {
		setNumero(++numeroDaConta);
		saldo = 0;
		setConta("NORMAL");
		abreConta();
	}
	
	public void abreConta() {
		String nome = Console.readLine("Informe o seu nome: ");
		setNome(nome.toUpperCase());
		String cpf = Console.readLine("Informe o seu cpf: ");
		setCpf(cpf);
	}
	
	public void deposita(double adicionaSaldo) {
		if(adicionaSaldo > 0) {
			this.saldo +=adicionaSaldo;
		}else {
			System.out.println("ERRO! Valor inválido! Valor negativo ou Nulo!");
		}
	}
	public void retira(double retiraSaldo) {
		if(this.conta.equals("ESPECIAL")) {
				if((this.saldo-retiraSaldo) >= -1000) {
					this.saldo -=retiraSaldo;
				}else {
				System.out.println("ERRO! Débito não pode ser inferior a -1000!");
				}
		}else {
			if(retiraSaldo>0) {
				if(retiraSaldo < this.saldo) {
					this.saldo -=retiraSaldo;
					
				}else {
				System.out.println("ERRO! Valor retirado superior ao Saldo atual!");
				}
			}else {
				System.out.println("ERRO! Valor inválido! Valor negativo ou Nulo!");
			}	
		}
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta.toUpperCase();
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancariaSimplificada [numero=" + numero + ", nome=" + nome + ", cpf=" + cpf + ", conta=" + conta
				+ ", saldo=" + saldo + "]";
	}
	
}
