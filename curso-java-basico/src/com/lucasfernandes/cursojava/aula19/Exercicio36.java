package com.lucasfernandes.cursojava.aula19;

public class Exercicio36 {

	public static void main(String[] args) {
		int[] a = new int[11];
		int base2 = 0;
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			base2 = (int) Math.pow(2, a[i]);
			System.out.println(""+a[i]+" na Base 2 = "+base2);
		}
	}

}
