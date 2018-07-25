package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nome = "";
		int idade;
		double salario;
		String sexo = "";
		String estado = "";
		boolean flag;
		
		do {
			flag = true;
			System.out.print("Dados Pessoais:");
			System.out.print("\nNome: ");
			nome = scan.nextLine();
			if(nome.length() < 3) {
				flag = false;
			}
			System.out.println(flag);
			
			System.out.print("Idade: ");
			idade = scan.nextInt();
			if(idade <= 0 || idade >= 150) {
				flag = false;
			}
			System.out.println(flag);
			
			System.out.print("Salário: ");
			salario = scan.nextDouble();
			if(salario < 0) {
				flag = false;
			}
			System.out.println(flag);
			
			System.out.print("Sexo: ");
			sexo = scan.next();
			if( !(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) ) {
				flag = false;
			}
			System.out.println(flag);
			
			System.out.print("Estado Civil: ");
			estado = scan.next();
			/*switch(estado) {
			case "S":
			case "C":
			case "V":
			case "D":
			case "s":
			case "c":
			case "v":
			case "d": break;
			default: flag = false;
			}*/
			if( !( estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c") || 
				   estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("d") ) ) {
				flag = false;
			}
			System.out.println(flag);
			
			if(flag == false) {
				System.out.println("## Erro de Cadastro!");
			}
		}while(flag == false);
		System.out.print("Finalizado com Sucesso!");
		
	}

}
