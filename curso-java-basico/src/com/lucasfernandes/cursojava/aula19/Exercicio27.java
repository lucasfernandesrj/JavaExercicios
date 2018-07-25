package com.lucasfernandes.cursojava.aula19;

public class Exercicio27 {

	public static void main(String[] args) {
		int[] a = new int[10];
		char[] b = new char[10];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*15);
			if(a[i] < 7) {
				b[i] = 'a';
			}else if(a[i] == 7) {
				b[i] = 'b';
			}else if(a[i] < 10) {
				b[i] = 'c';
			}else if(a[i] == 10) {
				b[i] = 'd';
			}else{
				b[i] = 'e';
			}
			System.out.println("A: "+a[i]+" e B: "+b[i]);
		}
	}

}
