package com.lucasfernandes.cursojava.aula19;

public class Exercicio11 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int contador = 0;
		System.out.print("Vetor: ");
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			if(a[i] % 2 == 0) {
				contador++;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println("\nQuantidade números pares: "+contador);
	}

}
