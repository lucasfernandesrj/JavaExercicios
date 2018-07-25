package com.lucasfernandes.cursojava.aula19;

public class Exercicio25 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*10);
			if(a[i]%2==0) {
				b[i]=1;
			}else {
				b[i]=0;
			}
			System.out.println("Vetor a = "+a[i]+" e Vetor b = "+b[i]);
		}
	}

}
