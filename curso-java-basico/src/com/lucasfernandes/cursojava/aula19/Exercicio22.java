package com.lucasfernandes.cursojava.aula19;

public class Exercicio22 {

	public static void main(String[] args) {
		int valor = 10;
		int[] a = new int[valor];
		int zero = 0;
		int um = 0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int) Math.round(Math.random()*1);
			if(a[i]==0) {
				zero++;
			}else {
				um++;
			}
		}
		
		int porZero = zero*100/valor;
		int porUm = um*100/valor;
		
		System.out.println("Zero:"+porZero+"% \nUm: "+porUm+"%");
	}

}
