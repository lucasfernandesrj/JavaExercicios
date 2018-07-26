package com.lucasfernandes.cursojava.aula24;

public class Exercicio03 {

	public static void main(String[] args) {
		LivroDeLivraria livro1 = new LivroDeLivraria();
		livro1.titulo = "Frankstein";
		livro1.autor = "Mary Shelley";
		livro1.pagina = 100;
		livro1.preco = 39.99;
		
		LivroDeLivraria livro2 = new LivroDeLivraria();
		livro2.titulo = "Dracula";
		livro2.autor = "Bram Stoker";
		livro2.pagina = 250;
		livro2.preco = 89.99;
		
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
	}

}
