package com.lucasfernandes.cursojava.aula46.exercicio;

public class Piramide extends Figura3D {
	private int baseAresta;
	private int altura;
	private int lados = 4;
	
	@Override
	public double calcularArea() {
		double apotema = Math.sqrt(Math.pow((baseAresta/2),2) + Math.pow(altura, 2));
		double areaDeUmaFace = (apotema * baseAresta) / 2;
		double areaTotaldasFaces = lados * areaDeUmaFace;
		
		double areaDaBase = Math.pow(baseAresta, 2);
		double areaTotal = areaDaBase + areaTotaldasFaces;
		return areaTotal;
	}
	
	@Override
	public double calcularVolume() {
		return (Math.pow(baseAresta, 2) * altura) / 3;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBaseAresta() {
		return baseAresta;
	}

	public void setBaseAresta(int baseAresta) {
		this.baseAresta = baseAresta;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
}