package com.lucasfernandes.cursojava.aula17;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 1,f1 = 1, f2 = 0;
		System.out.println("Sequencia fibonnaci até série 500: ");
		System.out.print(f2);
		while(f<500) {
			System.out.print(" "+f);
			f=f1+f2;
			f2=f1;
			f1=f;
		}
	}

}
