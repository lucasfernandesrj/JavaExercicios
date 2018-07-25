package com.lucasfernandes.cursojava.aula19;

public class Exercicio35 {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i=0;i<10;i++) {
			a[i] = (int) Math.round(Math.random()*100);
			System.out.print("Elemento: "+a[i]+" - Divisores: ");
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
