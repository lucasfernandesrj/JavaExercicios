package com.lucasfernandes.cursojava.aula19;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperatura = new double[365];
		
		temperatura[0] = 33.5;
		temperatura[1] = 30.1;
		temperatura[2] = 29;
		temperatura[3] = 27.4;
		temperatura[4] = 25;
		
		System.out.println("Temperaturas durante o ano");
		
		for(int i=0;i<temperatura.length;i++){
			System.out.println("Dia "+(i+1)+" - Temperatura: "+temperatura[i]);
		}
		
		int conta = 1;
		for(double nova: temperatura) {
			System.out.println("Dia "+(conta++)+" - Temperatura: "+nova);
		}
	}

}
