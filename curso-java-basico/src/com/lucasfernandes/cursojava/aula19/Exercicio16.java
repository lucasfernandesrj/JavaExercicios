package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio16 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int somaMenor15 = 0;
		int qtdIgual = 0;
		int qtdMaior15 = 0;
		int somaMaior15 = 0;
		double mediaSuperior = 0;
		int valor = 15;
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.print("Vetor: ");
		
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*30);
			if(a[i] < valor) {
				somaMenor15+=a[i];
			}else if(a[i] == 15) {
				qtdIgual++;
			}else {
				qtdMaior15++;
				somaMaior15+=a[i];
			}
			System.out.print(a[i]+" ");
		}
		mediaSuperior = (double) somaMaior15/qtdMaior15;
		
		System.out.println("\nSoma números  < 15: "+somaMenor15);
		System.out.println("Qtd números  == 15: "+qtdIgual);
		System.out.println("Média números > 15: "+df.format(mediaSuperior));
		
	}

}
