package com.lucasfernandes.cursojava.aula43.exercicio03;

public class Teste {

	public static void main(String[] args) {
		Animal camelo = new Animal("Camelo",150,4,"Amarelo","Terra",2);
		/*camelo.setNome("Camelo");
		camelo.setComprimento(150);
		//camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);*/
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setPatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e cauda.");
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso");
		urso.setComprimento(180);
		//urso.setPatas(4);
		urso.setCor("Vermelho");
		urso.setAmbiente("Terra");
		urso.setVelocidade(0.5);
		urso.setAlimento("Mel");
		
		System.out.println("Zoo:");
		System.out.println("--------------------------");
		System.out.println(camelo.toString());
		System.out.println("--------------------------");
		System.out.println(tubarao.toString());
		System.out.println("--------------------------");
		System.out.println(urso.toString());
		System.out.println("--------------------------");
	}

}
