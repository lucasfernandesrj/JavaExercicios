package com.lucasfernandes.cursojava.aula19;

public class Exercicio28 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i=0,j=(a.length-1);i<a.length;i++,j--) {
			a[i] = (int) Math.round(Math.random()*100);
			b[j] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("A:"+a[i]+" e B:"+b[i]);
		}
		
	}

}
