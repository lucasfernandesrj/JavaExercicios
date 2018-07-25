package com.lucasfernandes.cursojava.aula19;

public class Exercicio26 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*5);
			b[i] = (int) Math.round(Math.random()*5);
			
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] == b[i]){
				c[i] =0;
			}else {
				c[i] = -1;
			}
			
			System.out.println("A = "+a[i]+", B = "+b[i]+" e C = "+c[i]);
		}
	}
}
