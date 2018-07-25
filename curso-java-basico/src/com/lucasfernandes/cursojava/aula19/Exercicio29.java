package com.lucasfernandes.cursojava.aula19;

public class Exercicio29 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		
		for(int i=0;i<10;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			b[i] = (int) Math.round(Math.random()*10);
		}
		
		/*for(int i=0,j=19;i<10;i++,j--) {
			c[i] = a[i];
			c[j] = b[i];
		}*/
		
		for(int i=0;i<10;i++) {
			c[i] =a[i];
			c[a.length+i]=b[i];
		}
		
		System.out.print("Vetor A: ");
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for(int i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("\nVetor C: ");
		for(int i=0;i<20;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
