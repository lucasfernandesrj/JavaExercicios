package com.lucasfernandes.cursojava.aula43.exercicio02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanDouble = new Scanner(System.in);
		
		PessoaJuridica[] pj = new PessoaJuridica[3];
		for(int i = 0;i < pj.length;i++) {
			PessoaJuridica pj1 = new PessoaJuridica();
			System.out.print("Informe o nome(PJ): ");
			pj1.setNome(scan.nextLine());
			System.out.print("Informe a renda: ");
			pj1.setRenda(scanDouble.nextDouble());;
			pj[i] = pj1;
		}
		
		PessoaFisica[] pf = new PessoaFisica[3];
		for(int i = 0;i < pf.length; i++) {
			PessoaFisica pf1 = new PessoaFisica();
			System.out.print("Informe o nome(PF): ");
			pf1.setNome(scan.nextLine());
			System.out.print("Informe a renda: ");
			pf1.setRenda(scanDouble.nextDouble());
			pf[i] = pf1;
		}
		
		System.out.println();
		for(PessoaJuridica pjfinal : pj) {
			System.out.println(pjfinal.toString());
			System.out.println("Imposto: R$"+pjfinal.calcularImposto());
		}
		System.out.println();
		for(PessoaFisica pffinal : pf) {
			System.out.println(pffinal.toString());
			System.out.println("Imposto: R$"+pffinal.calcularImposto());
		}
		
		scan.close();
		scanDouble.close();
	}
}
