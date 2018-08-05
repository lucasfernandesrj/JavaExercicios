package com.lucasfernandes.cursojava.aula46.exercicio;

public class Cubo extends Figura3D {
	private double area;
	private double lados;
	
	@Override
	public double calcularArea() {
		return lados * Math.pow(area, 2);
	}
	@Override
	public double calcularVolume() {
		return Math.pow(lados, 3);
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getLados() {
		return lados;
	}
	public void setLados(double lados) {
		this.lados = lados;
	}
	
}
