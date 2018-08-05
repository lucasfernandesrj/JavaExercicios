package com.lucasfernandes.cursojava.aula46.exercicio;

public class Quadrado extends Figura2D {
	private int base;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(base, 2);
	}
	
}
