package com.lucasfernandes.cursojava.aula19;

public class Exercicio32 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int soma;
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			System.out.println("Tabuada de "+a[i]+": ");
			for(int j=1;j<=10;j++) {
				soma = a[i] * j;
				System.out.println(a[i]+" x "+j+" = "+soma);
			}
			System.out.println();
		}
	}
}
