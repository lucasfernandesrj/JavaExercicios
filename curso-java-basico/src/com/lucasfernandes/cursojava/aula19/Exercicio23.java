package com.lucasfernandes.cursojava.aula19;

public class Exercicio23 {

	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			if(a[i]%2!=0) {
				break;
			}
			System.out.println("Valor: "+a[i]);
		}
		
	}

}
