package com.lucasfernandes.cursojava.aula46.exercicio;

public class Teste {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		
		circulo.setNome("Circulo");
		circulo.setRaio(3);
		
		quadrado.setNome("Quadrado");
		quadrado.setBase(2);
		
		triangulo.setNome("Triangulo");
		triangulo.setAltura(25);
		triangulo.setBase(10);
		
		Cubo cubo = new Cubo();
		Piramide piramide = new Piramide();
		Cilindro cilindro = new Cilindro();
		
		cubo.setNome("Cubo");
		cubo.setLados(6);
		cubo.setArea(5);
		
		piramide.setNome("Piramide");
		piramide.setBaseAresta(18);
		piramide.setAltura(12);
		piramide.setLados(4);
		
		cilindro.setNome("Cilindro");
		cilindro.setAltura(12);
		cilindro.setRaio(4);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0]=circulo;
		figuras[1]=quadrado;
		figuras[2]=triangulo;
		
		figuras[3]=cubo;
		figuras[4]=piramide;
		figuras[5]=cilindro;
		
		for(FiguraGeometrica figura : figuras) {
			if(figura instanceof Figura2D) {
				System.out.print("2D - ");
			}else if(figura instanceof Figura3D) {
				System.out.print("3D - ");
			}
			System.out.println(figura.toString());
		}
	}
}
