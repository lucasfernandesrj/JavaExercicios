package com.lucasfernandes.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		for(int i=0;i<notas.length;i++) {
			Random r = new Random();
			notas[i] = r.nextInt(10);
		}
		
		for(int i=0;i<notas.length;i++) {
			System.out.print(notas[i]+" ");
		}
		
		System.out.println();
		
		for(int nota: notas) {
			System.out.print(nota+" ");
		}
	}
}
