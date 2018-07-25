package com.lucasfernandes.cursojava.aula15;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Tecle A-Alcool ou G-Gasolina: ");
		String tipo = scan.nextLine();
		System.out.println("Informe a quantidade em litros: ");
		double litro = scan.nextDouble();
		double preco = 0;
		
		if(tipo.equals("A")) {
			preco=litro*1.9;
			System.out.printf("Preço do Alcool s/ Desconto: %.2f", preco);
			if(litro <=20)preco/=1.03;
			else preco/=1.05;
		}else if(tipo.equals("G")) {
			preco=litro*2.5;
			System.out.printf("Preço da Gasolina s/ Desconto: %.2f", preco);
			if(litro <=20) preco/=1.04;
			else preco/=1.06;
		}else System.out.println("Tipo Inválido");
		
		if(tipo.equals("A")) System.out.printf("\nPreço do Alcool c/ Desconto: %.2f", preco);
		else if(tipo.equals("G")) System.out.printf("\nPreço da Gasolina c/ Desconto: %.2f", preco);
	}

}
