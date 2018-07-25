package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 3 lados do triângulo: ");
		int lado1 = scan.nextInt();
		int lado2 = scan.nextInt();
		int lado3 = scan.nextInt();
		int triangulo;
		
		// Verifica se é um triângulo
		if((lado1-lado2) < lado3 && lado3 < (lado1+lado2)) {
			if((lado2-lado3) < lado1 && lado1 < (lado2+lado3)) {
				if((lado3-lado1) < lado2 && lado2 < (lado3+lado1)) {
					triangulo = 1;
				}else triangulo = 0;
			}else triangulo = 0;
		}else triangulo = 0;
		
		// Verifica o tipo de triângulo
		if(triangulo == 1) {
			String tipo;
			if(lado1==lado2 && lado2 == lado3) {
				tipo = "É um Triângulo Equilátero!";
			}else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				tipo = "É um Triângulo Escaleno!";
			}else tipo = "É um Triângulo Isósceles!";
			System.out.println(tipo);
		} else System.out.println("Não é um triângulo");
	}

}
