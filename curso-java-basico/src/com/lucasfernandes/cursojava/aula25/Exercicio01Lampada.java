package com.lucasfernandes.cursojava.aula25;

public class Exercicio01Lampada {
	boolean luz = false;
	boolean conectado = false;
	
	public void ligarLampada() {
		if(conectado) {
			luz = true;
			
		}
	}
	
	public void desligarLampada() {
		if(conectado) {
			luz = false;
		}
	}
	
	public void ligarTomada() {
		conectado = true;
	}
	
	public void desligarTomada() {
		if(!luz) {
			conectado = false;
		}
	}
}
