package com.lucasfernandes.cursojava.aula10;

public class Variaveis {
	public static void main(String [] args) {
		//convenção Java
		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "totó";
		String ano2014 = "2014";
		
		//aceitos, mas não utilizaveis
		int _idade;
		int $idade;
		
		//não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		//má prratica
		int a = 10;
		String b = "Lucas";
	}
}
