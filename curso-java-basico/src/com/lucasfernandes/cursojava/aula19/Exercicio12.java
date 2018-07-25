package com.lucasfernandes.cursojava.aula19;

public class Exercicio12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int contador = 0;
		System.out.print("Vetor: ");
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			contador+=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\nO resultado da soma dos elementos é "+contador);
	}

}
