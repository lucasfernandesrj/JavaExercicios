package com.lucasfernandes.cursojava.aula19;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] a = new int[8];
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			b[i] = a[i] *2;
			System.out.println("Elemento A = "+a[i]+" Elemento B = "+b[i]);
		}
		System.out.println("Tamanho do Elemento A = "+a.length+" e do Elemento B = "+b.length);
	}

}