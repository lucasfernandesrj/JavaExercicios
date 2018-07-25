package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int cont=0;
		int i=0;
		double temp;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		double media = 0;
		do {
			i++;
		System.out.printf("Temperatura %d: ", i);
		temp = scan.nextDouble();
		soma+=temp;
			if(temp > maior) {
				maior = temp;
			} 
			if(temp < menor) {
				menor = temp;
			}
			System.out.println("Deseja continuar? (s-sim n-não)");
			String resp = scan.next();
			if(resp.equalsIgnoreCase("s")) {
				cont = 1;
			}else {
				cont = 0;
			}
		}while(cont!=0);
		
		media = (double)soma/i;
		System.out.print("Maior temperatura: "+maior+" \nMenor temperatura: "+menor);
		System.out.printf(" \nMédia: %.2f", media);
		
	}

}
