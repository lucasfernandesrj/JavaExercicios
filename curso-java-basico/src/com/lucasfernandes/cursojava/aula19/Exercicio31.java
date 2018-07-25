package com.lucasfernandes.cursojava.aula19;

public class Exercicio31 {

	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[a.length];
		int posB=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*20);
			if(a[i]%2==0) {
				b[posB]=a[i];
				posB++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				b[posB]=a[i];
				posB++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nVetor B: ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
