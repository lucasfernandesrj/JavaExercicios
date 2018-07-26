package com.lucasfernandes.cursojava.aula24;

import java.text.DecimalFormat;

public class Lampada {
	boolean acesa = false;
	boolean conectada = false;
	double preco;
	
	DecimalFormat df = new DecimalFormat("##,###.###");
	
	public void adicionarPreco(double preco) {
		this.preco = preco;
	}
	
	public void mostrarPreco() {
		System.out.println("Preço: R$ "+df.format(preco)+"");
	}
	
	public void acender() {
		if(conectada) {
			acesa = true;
			System.out.println("Lampada acesa!");
		}
	}
	
	public void apagar() {
		acesa = false;
		System.out.println("Lampada apagada!");
	}
	
	public void conectar(){
		conectada = true;
		System.out.println("Lampada conectada!");
	}
	
	public void desconectar() {
		if(!acesa) {
			conectada = false;
			System.out.println("Lampada desconectada!");
		}else {
			System.out.println("Não foi possível desconectar!");
		}
	}
}
