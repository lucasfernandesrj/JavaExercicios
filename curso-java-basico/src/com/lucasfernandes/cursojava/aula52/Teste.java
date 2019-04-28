package com.lucasfernandes.cursojava.aula52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int resp = 1;
		while(resp != 3) {
			resp = opcaoMenu(scan);
			if(resp == 1) {
				consultarContato(scan, agenda);
			}else if(resp == 2) {
				adicionarContato(scan, agenda);
			}else if(resp == 3) {
				System.exit(0);
			}
		}
	}
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		System.out.println("Criando um contato, entre com as informações");
		String nome = leInformacao(scan, "Entre com o nome do contato");
		String telefone = leInformacao(scan, "Entre com o telefone do contato");
		
		Contato c = new Contato(nome,telefone);
		System.out.println(c);
		try {
		agenda.adicionarContato(c);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leInformacao(scan, "Informe o nome do contato a ser pesquisado");
		try {
			if(agenda.consultarContato(nomeContato) >= 0) {
				System.out.println("Contato Existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e);
		}
	}
	
	public static String leInformacao(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	public static int opcaoMenu(Scanner scan) {
		boolean valida = false;
		int resp = 0;
		while(!valida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1-Consultar o Contato");
			System.out.println("2-Adicionar um Contato");
			System.out.println("3-Sair");
			try {
				String entrada = scan.nextLine();
				resp = Integer.parseInt(entrada);
				if (resp == 1 || resp == 2 || resp == 3){
					valida = true;
				}else {
					throw new Exception("Entrada inválida");
				}
			}catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente!\n");
				
			}
		}
		return resp;
	}
}
