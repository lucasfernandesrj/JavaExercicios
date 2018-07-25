package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio21 {

	public static void main(String[] args) {
		double[] dolar = new double[20];
		DecimalFormat df = new DecimalFormat("###,###.##");
		for(int i=0;i<dolar.length;i++) {
			dolar[i] = (i+1) * 0.26;
			System.out.println("Real: R$ "+(i+1)+" > Dolar: U$ "+df.format(dolar[i]));
		}
	}

}
