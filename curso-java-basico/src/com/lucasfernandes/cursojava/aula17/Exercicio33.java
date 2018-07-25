package com.lucasfernandes.cursojava.aula17;

public class Exercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("S =");
		double div = 0;
		double soma = 0;
		int max = 5;
		for(int i=1,j=1;i<=max;i++,j+=2) {
			System.out.print(" "+i+"/"+j);
			div = (double)i/j;
			if(i<(max)) {
				System.out.print(" +");
			}else {
				System.out.print(".");
			}
			soma+=div;
		}
		System.out.printf("\nResultado: %.2f",soma);
	}

}
