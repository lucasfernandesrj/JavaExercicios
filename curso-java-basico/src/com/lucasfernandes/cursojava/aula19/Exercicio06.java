package com.lucasfernandes.cursojava.aula19;

public class Exercicio06 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int [a.length];
		
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			b[i] = a[i];
			c[i] = b[i] + a[i];
			System.out.println("Elemento A = "+a[i]+" Elemento B = "+b[i]+" Elemento C = "+c[i]);
		}
		System.out.println("Tamanho do Elemento A = "+a.length+", do Elemento B = "+b.length+" e do Elemento C = "+c.length);
	}

}
