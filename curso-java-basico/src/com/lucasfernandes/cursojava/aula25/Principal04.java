package com.lucasfernandes.cursojava.aula25;

public class Principal04 {

	public static void main(String[] args) {
		System.out.println("Jogo da Velha - Tabuleiro:  ");
		Exercicio04JogoDaVelha e1 = new Exercicio04JogoDaVelha();
		e1.iniciarJogo();
			while(!e1.venceu) {
				e1.jogarRodada();
			}
		
	}

}
