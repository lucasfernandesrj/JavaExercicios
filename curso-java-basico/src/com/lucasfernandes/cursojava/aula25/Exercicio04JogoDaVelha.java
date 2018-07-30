package com.lucasfernandes.cursojava.aula25;

import java.util.Scanner;

public class Exercicio04JogoDaVelha {
		
		char[][] jogoVelha = new char[3][3];
		Scanner scan = new Scanner(System.in);
		
		char escolha = 'X';
		boolean venceu = false;
		int linha,coluna;
		int jogada = 0;
		
		public void iniciarJogo() {
			for(int i=0;i<jogoVelha.length;i++) {
				for(int j=0;j<jogoVelha[i].length;j++) {
					jogoVelha[i][j] = '#';
				}
			}
			mostrarJogo();
		}
		public void mostrarJogo() {
			for(int i=0;i<jogoVelha.length;i++) {
				System.out.print("| ");
				for(int j=0;j<jogoVelha[i].length;j++) {
					System.out.print(jogoVelha[i][j]+" | ");
				}
				System.out.println();
			}
		}
		
		public void jogarRodada() {
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
					mostrarJogo();
					verificarVitoria();
		}
				
		public void verificarVitoria() {
			if( (jogoVelha[0][0] == jogoVelha[1][1] && jogoVelha[1][1] == jogoVelha[2][2]) || 
					(jogoVelha[0][2] == jogoVelha[1][1] && jogoVelha[1][1] == jogoVelha[2][0]) ) {
						if(jogoVelha[1][1]!='#') {
							System.out.println("Método Diagonal - O vencedor é "+escolha);
							venceu = true;
							scan.close();
						}
					}else {
						for(int k=0;k<jogoVelha.length;k++) {
							if(jogoVelha[k][0] == jogoVelha[k][1] && jogoVelha[k][0] == jogoVelha[k][2]) {
								if(jogoVelha[k][0]!='#') {
									System.out.println("Método Horizontal(linha) - O vencedor é "+escolha);
									venceu = true;
									scan.close();
									break;
								}
							}
							if( (jogoVelha[0][k] == jogoVelha[1][k]) && (jogoVelha[0][k] == jogoVelha[2][k]) && (jogoVelha[2][k] == jogoVelha[1][k]) ) {
								if(jogoVelha[0][k]!='#' && jogoVelha[1][k]!='#' && jogoVelha[2][k]!='#') {
									System.out.println(jogoVelha[0][k]+" = "+jogoVelha[1][k]+" = "+jogoVelha[2][k]);
									System.out.println("Método Vertical(coluna) - O vencedor é "+escolha);
									venceu = true;
									scan.close();
									break;
								}
							}
						}
					}	
			if(jogada >= 9) {
				if(!venceu) {
					System.out.println("Velha! O jogo terminou empatado!");
					venceu = true;
				}else {
					System.out.println("Fim de jogo!");
				}
			}
		}
}
