package com.lucasfernandes.cursojava.aula36.exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Agenda a1 = new Agenda();
		
		System.out.print("Infome o nome do grupo da Agenda: ");
		a1.setNomeAgenda(scan.nextLine());
		
		Contato contato0 = new Contato();
		System.out.print("Informe o nome do contato 1: ");
		contato0.setNomeContato(scan.nextLine());
		System.out.print("Informe o email do contato 1 : ");
		contato0.setEmail(scan.nextLine());
		System.out.print("Informe o telefone do contato 1: ");
		contato0.setTelefone(scan.nextLine());
		
		System.out.println();
		
		Contato contato1 = new Contato();
		System.out.print("Informe o nome do contato 2: ");
		contato1.setNomeContato(scan.nextLine());
		System.out.print("Informe o email do contato 2: ");
		contato1.setEmail(scan.nextLine());
		System.out.print("Informe o telefone do contato 2: ");
		contato1.setTelefone(scan.nextLine());
		
		System.out.println();
		
		Contato contato2 = new Contato();
		System.out.print("Informe o nome do contato 3: ");
		contato2.setNomeContato(scan.nextLine());
		System.out.print("Informe o email do contato 3: ");
		contato2.setEmail(scan.nextLine());
		System.out.print("Informe o telefone do contato 3: ");
		contato2.setTelefone(scan.nextLine());
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato0;
		contatos[1] = contato1;
		contatos[2] = contato2;
		a1.setContato(contatos);
		
		System.out.println();
		
		System.out.println("Nome do grupo: "+a1.getNomeAgenda());
		System.out.println();
		if(a1 != null && a1.getContato() != null) {
			for(Contato cont : contatos) {
				System.out.println("Nome: "+cont.getNomeContato());
				System.out.println("Email: "+cont.getEmail());
				System.out.println("Telefone: "+cont.getTelefone());
				System.out.println();
			}
		}
		scan.close();
		scanInt.close();
	}
}
