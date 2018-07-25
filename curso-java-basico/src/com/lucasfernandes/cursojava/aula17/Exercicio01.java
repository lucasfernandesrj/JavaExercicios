package com.lucasfernandes.cursojava.aula17;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nota;
		do {
		System.out.print("Informe uma nota (entre 0 e 10): ");
		nota = scan.nextInt();
		if(nota > 10 || nota < 0) {
			System.out.println("Valor inválido!");
		}
		} while(nota > 10 || nota < 0);
		
		System.out.println("Valor válido!");
		
	}

}
