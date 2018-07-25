package com.lucasfernandes.cursojava.aula20;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Jogo da Velha - Tabuleiro:  ");
		char[][] jogoVelha = new char[3][3];
		
		for(int i=0;i<jogoVelha.length;i++) {
			for(int j=0;j<jogoVelha[i].length;j++) {
				jogoVelha[i][j] = '#';
			}
		}
		
		for(int i=0;i<jogoVelha.length;i++) {
			System.out.print("| ");
			for(int j=0;j<jogoVelha[i].length;j++) {
				System.out.print(jogoVelha[i][j]+" | ");
			}
			System.out.println();
		}
		
		char escolha = 'X';
		/*
		int escolhaInt;
		char opcao;
		do {
			System.out.println("Escolha um lado 1-Letra 'X' ou 2-Letra 'O': ");
			escolhaInt = scan.nextInt();
			
			if(escolhaInt == 1) {
				opcao = 'X';
			}else if(escolhaInt == 2) {
				opcao = 'O';
			}else {
				System.out.println("Escolha Inválida!");
			}
		}while(escolhaInt != 1 || escolhaInt !=2);
		*/
		boolean venceu = false;
		int linha,coluna;
		int jogada = 0;
		for(int i=0;i<jogoVelha.length;i++) {
			for(int j=0;j<jogoVelha[i].length;j++) {
				do {
				if(jogada % 2 == 0) {
					escolha = 'X';
				}else {
					escolha = 'O';
				}
				System.out.println("\nJogo da Velha - "+(jogada+1)+"ª Rodada");
				System.out.println("Jogador "+escolha+"");
				System.out.print("Informe a Linha (horizontal): ");
				linha = scan.nextInt();
				System.out.print("Informe a Coluna (vertical): ");
				coluna = scan.nextInt();
				
				if(linha > 3 || coluna > 3 || jogoVelha[(linha-1)][(coluna-1)] != '#') {
					System.out.println("Jogada inválida!");
				}
				}while(linha > 3 || coluna > 3 || jogoVelha[(linha-1)][(coluna-1)] != '#');
				
				jogoVelha[(linha-1)][(coluna-1)] = escolha;
				jogada++;
				
				for(int k=0;k<jogoVelha.length;k++) { 
					System.out.print("| ");
					for(int l=0;l<jogoVelha[k].length;l++) {
						System.out.print(jogoVelha[k][l]+" | ");
					}
					System.out.println();
				}
				
				if( (jogoVelha[0][0] == jogoVelha[1][1] && jogoVelha[1][1] == jogoVelha[2][2]) || 
				(jogoVelha[0][2] == jogoVelha[1][1] && jogoVelha[1][1] == jogoVelha[2][0]) ) {
					if(jogoVelha[1][1]!='#') {
						System.out.println("Método Diagonal - O vencedor é "+escolha);
						venceu = true;
					}
				}else {
					for(int k=0;k<jogoVelha.length;k++) {
						if(jogoVelha[k][0] == jogoVelha[k][1] && jogoVelha[k][0] == jogoVelha[k][2]) {
							if(jogoVelha[k][0]!='#') {
								System.out.println(jogoVelha[k][0]+" = "+jogoVelha[k][1]+" = "+jogoVelha[k][2]);
								System.out.println("Método Horizontal(linha) - O vencedor é "+escolha);
								venceu = true;
								break;
							}
						}
						if( (jogoVelha[0][k] == jogoVelha[1][k]) && (jogoVelha[0][k] == jogoVelha[2][k]) && (jogoVelha[2][k] == jogoVelha[1][k]) ) {
							if(jogoVelha[0][k]!='#' && jogoVelha[1][k]!='#' && jogoVelha[2][k]!='#') {
								System.out.println(jogoVelha[0][k]+" = "+jogoVelha[1][k]+" = "+jogoVelha[2][k]);
								System.out.println("Método Vertical(coluna) - O vencedor é "+escolha);
								venceu = true;
								break;
							}
						}
					} //fim for k
				}
				if(venceu == true) {
					break;
				}
			} // fim for j
			if(venceu == true) {
				break;
			}
			System.out.println();
		} // fim for i
		if(venceu == false) {
			System.out.println("Velha! O jogo terminou empatado!");
		}
	}

}
