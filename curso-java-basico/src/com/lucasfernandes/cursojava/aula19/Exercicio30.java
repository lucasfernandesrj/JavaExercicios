package com.lucasfernandes.cursojava.aula19;

public class Exercicio30 {

	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[a.length]; //pares
		int[] c = new int[a.length]; //impares
		int posB = 0,posC = 0;
		
		for(int i=0;i<20;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			if(a[i]%2==0) {
				b[posB]=a[i];
				posB++;
			}else {
				c[posC]=a[i];
				posC++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nVetor B(Par): ");
		for(int i=0;i<posB;i++) {
			System.out.print(b[i]+" ");	
		}
		System.out.print("\nVetor C(Impar): ");
		for(int i=0;i<posC;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
