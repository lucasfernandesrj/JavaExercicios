package av1correcao;

import java.util.ArrayList;

public class Selecao {
	private static int contador = 0;
	private int numero;
	private String nome;
	ArrayList<Atleta>time = new ArrayList<Atleta>();
	
	public Selecao(String nome, Atleta atleta) {
		this.numero = ++contador;
		this.nome = nome;
		this.time.add(atleta);
	}
	
	public Selecao(String nome) {
		this.numero = ++contador;
		this.nome = nome;
	}
	
	public void adicionaAtleta(Atleta obj) throws Exception {
		if(numero < 22) {
			time.add(obj);
		}else {
			throw new Exception("Limite de Atletas atingido!");
		}
	}
	public void imprime() {
		System.out.println(time.toString());
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
