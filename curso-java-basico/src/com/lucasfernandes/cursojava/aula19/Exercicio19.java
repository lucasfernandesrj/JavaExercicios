package com.lucasfernandes.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double [] result = new double[10];
		String[] media = new String[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<10;i++) {
			System.out.println("Informe as duas notas do aluno Cod:"+i+": ");
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
			result[i] = (nota1[i]+nota2[i])/2;
			if(result[i]<7) {
				media[i] = " - Aluno REPROVADO!";
			}else {
				media[i] = " - Aluno APROVADO!";
			}
		}
		DecimalFormat df = new DecimalFormat("###,###.##");
		for(int i=0;i<nota1.length;i++) {
			System.out.println("Aluno "+i+" - Nota1: "+df.format(nota1[i])+" Nota2:"+df.format(nota2[i])+" Resultado:"+df.format(result[i])+media[i]);
		}
		scan.close();
	}
}
