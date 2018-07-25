package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ganho por hora: ");
		double ganhoHora = scan.nextDouble();
		System.out.print("Informe o número de horas trabalhadas no mês: ");
		double horaMes = scan.nextDouble();
		double salarioMesBruto = ganhoHora*horaMes;
		System.out.printf("Salário Bruto: R$ %.2f", salarioMesBruto);
		double impRenda = (salarioMesBruto/100)*11;
		
		System.out.print("\nIR (11%) : R$ "+impRenda);
		double inss = (double)(salarioMesBruto/100)*8;
		System.out.print("\nINSS (8%) : R$ " + inss);
		double sind = (salarioMesBruto/100)*5;
		System.out.print("\nSindicato (5%) : R$ " + sind);
		double totalDescontos = impRenda+inss+sind;
		
		double salarioMesLiq = salarioMesBruto-totalDescontos;
		System.out.printf("\nDescontos : R$ %.2f ", totalDescontos);
		System.out.printf("\nSalário Líquido : R$ %.2f ", salarioMesLiq);
	}

}
