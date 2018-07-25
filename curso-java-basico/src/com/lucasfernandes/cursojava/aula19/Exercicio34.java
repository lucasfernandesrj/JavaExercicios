package com.lucasfernandes.cursojava.aula19;

public class Exercicio34 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			System.out.println("Analisando o número "+a[i]);
			for(int j=1;j<a[i];j++) {
				if(j % 2 == 0) {
					System.out.println("Pares: "+j);
				}
			}
			System.out.println();
		}
	}
}
