package com.lucasfernandes.cursojava.aula36.exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Agenda a1 = new Agenda();
		
		System.out.print("Infome o nome do grupo da Agenda: ");
		a1.setNomeAgenda(scan.nextLine());
		
		Contato[] contatos = new Contato[3];
		for(int i = 0;i<contatos.length;i++) {
			Contato contato = new Contato();
			System.out.print("Informe o nome do contato "+(i+1)+": ");
			contato.setNomeContato(scan.nextLine());
			System.out.print("Informe o email do contato "+(i+1)+": ");
			contato.setEmail(scan.nextLine());
			System.out.print("Informe o telefone do contato "+(i+1)+": ");
			contato.setTelefone(scan.nextLine());
			contatos[i]=contato;
			System.out.println();
		}
		a1.setContato(contatos);
		
		System.out.println("Nome do grupo: "+a1.getNomeAgenda());
		
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
