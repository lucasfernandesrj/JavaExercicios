package com.lucasfernandes.cursojava.aula20;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String compromissos[][] = new String[31][24];
		Scanner scan = new Scanner(System.in);
		Scanner scanTxt = new Scanner(System.in);
		int resp = 1;
		
		for(int i = 0;i < compromissos.length;i++) {
			for(int j = 0;j < compromissos[i].length;j++) {
				compromissos[i][j] = "vazio";	
			}
		}
		
		while(resp != 0) {
			System.out.println("AGENDA PESSOAL - COMPROMISSOS");
			//System.out.println("1 - Alterar, 2 - Consultar ou 0 - Sair:");
			System.out.println("Digite 1 para ALTERAR compromisso. ");
			System.out.println("Digite 2 para CONSULTAR compromisso. ");
			System.out.println("Digite 0 para SAIR. ");
			resp = scan.nextInt();
			int dia;
			int hora;
			if(resp == 1) {
				boolean valido = false;
				do {
					System.out.print("Informe o DIA: ");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						valido = true;
					}else {
						System.out.println("Dia inválido, informe novamente! ");
						valido = false;
					}
				}while(!valido);
				
				do {
					System.out.print("Informe a HORA: ");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 23) {
						valido = true;
					}else {
						System.out.println("Hora inválida, informe novamente! ");
						valido = false;
					}
				}while(!valido);
				
				System.out.println("Informe o COMPROMISSO: ");
				compromissos[(dia-1)][hora] = scanTxt.nextLine();
				
				System.out.println("DIA: "+dia+" - HORA: "+hora+" - COMPROMISSO: "+compromissos[(dia-1)][hora].toUpperCase());
			
			}else if(resp == 2) {
				System.out.println("Consulta: ");
				
				for(int i = 0;i < compromissos.length;i++) {
					for(int j = 0;j < compromissos[i].length;j++) {
						if(!compromissos[i][j].equals("vazio")) {
							System.out.println("DIA: "+(i+1)+" - HORA: "+j+" - COMPROMISSO: "+compromissos[i][j].toUpperCase());
						}
					}
				}
			}else if(resp == 0) {
				System.out.println("FECHANDO A AGENDA!");
			}else {
				System.out.println("VALOR INVÁLIDO!");
			}
			System.out.println();
		}
		scan.close();
		scanTxt.close();
	}

}
