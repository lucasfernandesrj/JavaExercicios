package com.lucasfernandes.cursojava.aula19;

public class Exercicio33 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean primo = true;
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*100);
			
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0 || a[i]==1) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.println("O valor "+a[i]+" é Primo.");
			}else {
				System.out.println("O valor "+a[i]+" não é Primo.");
			}
		}
	}
}
