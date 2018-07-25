package com.lucasfernandes.cursojava.aula19;

public class Exercicio37 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];
		int fat=1;
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*9);
			
			for(int j=1;j<=a[i];j++) {
				fat*=j;
			}
			b[i]=fat;
			fat=1;
			System.out.println("Numero:"+a[i]+"  Fatorial:"+b[i]);
		}
	}

}
