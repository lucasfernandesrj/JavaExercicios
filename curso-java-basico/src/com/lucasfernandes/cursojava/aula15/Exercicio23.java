package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha F-File Duplo, A-Alcatra ou P-Picanha: ");
		String escolha = scan.nextLine();
		if(escolha.equals("F") || escolha.equals("A") || escolha.equals("P")) {
			
			System.out.println("Informe a quantidade (em Kg): ");
			int quant = scan.nextInt();
			double preco = 0;
			
			String nescolha = "";
			String npag = "";
			double finalpreco = 0;
			
			if(escolha.equals("F")) {
				nescolha = "File Duplo";
				if(quant <= 5) preco = quant*4.9;
				else preco = quant*5.8;
			}else if(escolha.equals("A")) {
				nescolha = "Alcatra";
				if(quant <= 5) preco = quant*5.9;
				else preco = quant*6.8;
			}else if(escolha.equals("P")) {
				nescolha = "Picanha";
				if(quant <= 5) preco = quant*6.9;
				else preco = quant*7.8;
			}
			
			System.out.println("Forma de pagamento: 1-Cartão Tabajara 0-Outros");
			int pag = scan.nextInt();
			if(pag == 1) {
				npag = "Cartão Tabajara";
				finalpreco= preco /1.05; 
			}else {
				npag = "Outros";
				finalpreco = preco;
			}
			
			System.out.println("## Cupom Fiscal ##");
			System.out.println("Tipo: "+nescolha);
			System.out.println("Quantidade de Carne: "+quant);
			System.out.printf("Preço Total: R$ %.2f\n", preco);
			System.out.println("Tipo de Pagamento: "+npag);
			System.out.printf("Valor do Desconto: R$ %.2f\n", (finalpreco-preco));
			System.out.printf("Valor a Pagar: R$ %.2f\n", finalpreco);
		}else System.out.println("Escolha Inválida!");
	}

}
