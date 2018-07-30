package com.lucasfernandes.cursojava.aula34;

public class Calculadora {

	public static double somarNum(double num1,double num2) {
		return num1+num2;
	}
	
	public static double subtrairNum(double num1,double num2) {
		return num1-num2;
	}
	
	public static double multiplicarNum(double num1,double num2) {
		return num1*num2;
	}
	
	public static double dividirNum(double num1,double num2) {
		return num1/num2;
	}
	
	public static double potencializarNum(double num1, double num2) {
		double resultado = num1;
		for(int i = 1;i < num2;i++) {
			resultado *= num1;
		}
		return resultado;
	}
	
	public static double fatorial(double num1) {
		double limite = num1;
		for(int i = 1;i < limite;i++) {
			num1 *= i;
		}
		return num1;
	}
}
