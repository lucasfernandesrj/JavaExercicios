package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio20 {

	public static void main(String[] args) {
		double[] real = new double[20];
		double[] dolar = new double[20];
		DecimalFormat df = new DecimalFormat("###,###.##");
		for(int i=0;i<real.length;i++) {
			dolar[i]=i+1;
			real[i] = dolar[i] * 2.59;
			System.out.println(" Dolar: U$ "+df.format(dolar[i]).trim()+" > Real: R$ "+df.format(real[i]));
		}
	}

}
