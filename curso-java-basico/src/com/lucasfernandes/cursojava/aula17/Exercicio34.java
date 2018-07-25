package com.lucasfernandes.cursojava.aula17;

public class Exercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("H =");
		double div = 0;
		double soma = 0;
		int max = 2;
		for(int i=1;i<=max;i++) {
			if(i==1) {
				System.out.print(" 1");
			}else {
			System.out.print(" 1/"+i);
			}
			div = (double)1/i;
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
