package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio14 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int soma = 0;
		double contador = 0;
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.print("Vetor: ");
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			if(a[i] % 2 != 0) {
				soma+=a[i];
				contador++;
			}
			System.out.print(a[i]+" ");
		}
		double resultado = soma/contador;
		System.out.println("\nSoma: "+soma);
		System.out.println("Média: "+df.format(resultado));
	}
}
