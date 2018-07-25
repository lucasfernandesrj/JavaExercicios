package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o tamanho do arquivo para download(em MB): ");
		int arq = scan.nextInt();
		System.out.print("Informe a velocidade de internet(em Mbps): ");
		double vel = scan.nextDouble();
		System.out.println("Taxa de uploud: "+vel/8+" MB/s");
		double down = (arq/(vel/8))/60;
		System.out.printf("Download concluído em %.2f minutos.", down);
		
		
	}

}
