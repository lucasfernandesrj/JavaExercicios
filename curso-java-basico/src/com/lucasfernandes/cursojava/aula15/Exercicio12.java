package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor da hora: ");
		double valorhora = scan.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		double qtdhora = scan.nextDouble();
		double salariobruto = valorhora*qtdhora; 
		double ir=0;
		int irn=0;
		if(salariobruto <=900)ir=0;
		else if(salariobruto <= 1500) { ir = salariobruto*0.05;irn = 5;}
		else if(salariobruto <= 2500) {ir = salariobruto*0.1;irn = 10;}
		else {ir = salariobruto*0.2; irn = 20;}
		double inss = salariobruto*0.1;
		//double sindicato = salariobruto*0.03;
		double fgts = salariobruto*0.11;
		double totaldescontos = ir+inss;
		double salarioliquido = salariobruto-totaldescontos;
		System.out.println("Salário Bruto ("+valorhora+" * "+qtdhora+") : R$ "+salariobruto);
		System.out.println("(-) IR ("+irn+"%) :                 R$ "+ir);
		System.out.println("(-) INSS (10%) :              R$ "+inss);
		System.out.println("FGTS (11%) :                  R$ "+fgts);
		System.out.println("Total de descontos :          R$ "+totaldescontos);
		System.out.println("Salário Líquido :             R$ "+salarioliquido);
	}

}
