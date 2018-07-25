package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe um valor em metros: ");
		Scanner scan = new Scanner(System.in);
		int metro = scan.nextInt();
		int centimetro = metro*100;
		System.out.println(metro + " metro(s) corresponde a "+ centimetro+ " centimetro(s)");
	}

}
