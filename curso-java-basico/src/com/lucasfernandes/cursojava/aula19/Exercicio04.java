package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] a = new int[15];
		DecimalFormat df = new DecimalFormat("###,###.##");
		double[] b = new double[a.length];
		
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			b[i] = Math.sqrt(a[i]);
			System.out.println("Elemento A = "+a[i]+" Elemento B = "+df.format(b[i]));
		}
		System.out.println("Tamanho do Elemento A = "+a.length+" e do Elemento B = "+b.length);
	}

}
