package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String []args){
		System.out.println("Sal�rio por hora: ");
		Scanner scan = new Scanner(System.in);
		double salarioHora = scan.nextDouble();
		System.out.println("Horas trabalhadas no m�s: ");
		int hora = scan.nextInt();
		double salarioMes = salarioHora*hora;
		System.out.println("Sal�rio do M�s: " + salarioMes);
	}

}
