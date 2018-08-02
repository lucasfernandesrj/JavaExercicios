package com.lucasfernandes.cursojava.aula36.exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Agenda a1 = new Agenda();
		
		System.out.print("Infome o nome do grupo da Agenda: ");
		a1.setNome(scan.nextLine());
		
		Contato[] contatos = new Contato[3];
		for(int i = 0;i<contatos.length;i++) {
			System.out.println("Informações do contato "+(i+1)+": ");
			Contato contato = new Contato();
			System.out.print("Informe o nome: ");
			contato.setNome(scan.nextLine());
			System.out.print("Informe o email: ");
			contato.setEmail(scan.nextLine());
			System.out.print("Informe o telefone: ");
			contato.setTelefone(scan.nextLine());
			contatos[i]=contato;
			System.out.println();
		}
		a1.setContato(contatos);
		
		System.out.println(a1.mostrarInfo());

		scan.close();
		scanInt.close();
	}
}
