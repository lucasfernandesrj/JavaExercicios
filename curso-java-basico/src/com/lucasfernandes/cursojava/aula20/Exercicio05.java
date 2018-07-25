package com.lucasfernandes.cursojava.aula20;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String compromissos[][][] = new String[12][31][24];
		Scanner scan = new Scanner(System.in);
		Scanner scanTxt = new Scanner(System.in);
		int resp = 1;
		
		for(int i = 0;i < compromissos.length;i++) {
			for(int j = 0;j < compromissos[i].length;j++) {
				for(int k = 0;k < compromissos[i][j].length;k++) {
					compromissos[i][j][k] = "vazio";
				}
			}
		}
		
		while(resp != 0) {
			System.out.println("###  AGENDA PESSOAL - COMPROMISSOS  ###");
			System.out.println("1 - Alterar, 2 - Consultar ou 0 - Sair:");
			resp = scan.nextInt();
			
			if(resp == 1) {
				int mes;
				do{
					System.out.print("Informe o MES: ");
					mes = scan.nextInt();
					if(mes < 0 || mes > 12) {
						System.out.println("Mês inválido!");
					}
				}while(mes <= 0 || mes > 12);
				
				int dia;
				do {
					System.out.print("Informe o DIA: ");
					dia = scan.nextInt();
					if(dia <= 0 || dia > 31) {
						System.out.println("Dia inválido!");
					}
				}while(dia <= 0 || dia > 31);
				
				int hora;
				do{
					System.out.print("Informe a HORA(08 a 16hrs): ");
					hora = scan.nextInt();
					if(hora < 8 || hora > 16) {
						System.out.println("Hora inválida!");
					}
				}while(hora < 8 || hora > 16);
				
				System.out.println("Informe o COMPROMISSO: ");
				compromissos[(mes-1)][(dia-1)][hora] = scanTxt.nextLine();
				System.out.println("MES: "+mes+" - DIA: "+dia+" - HORA: "+hora+" - COMPROMISSO: "+compromissos[(mes-1)][(dia-1)][hora].toUpperCase());
			}else if(resp == 2) {
				System.out.println("Consulta: ");
				for(int i = 0;i < compromissos.length;i++) {
					for(int j = 0;j < compromissos[i].length;j++) {
						for(int k = 0;k < compromissos[i][j].length;k++) {
							if(!compromissos[i][j][k].equals("vazio")) {
								System.out.println("MES: "+(i+1)+" - DIA: "+(j+1)+" - HORA: "+j+" - COMPROMISSO: "+compromissos[i][j][k].toUpperCase());
							}
						}
					}
				}
			}else if(resp == 0){
				System.out.println("SAIU DO PROGRAMA.");
			}
			else {
				System.out.println("VALOR INVÁLIDO!");
			}
			System.out.println();
		}
		scan.close();
		scanTxt.close();
	}

}
