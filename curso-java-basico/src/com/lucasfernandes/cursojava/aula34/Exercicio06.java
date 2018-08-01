package com.lucasfernandes.cursojava.aula34;

public class Exercicio06 {

	public static void main(String[] args) {
		double num1 = 1;
		
		System.out.println(ConversaoDeUnidadesDeTempo.converterMinutoParaSegundo(num1));
		System.out.println(ConversaoDeUnidadesDeTempo.converterHoraParaMinutos(num1));
		System.out.println(ConversaoDeUnidadesDeTempo.converterDiaParHora(num1));
		
		System.out.println(ConversaoDeUnidadesDeTempo.converterSemanaParaDia(num1));
		System.out.println(ConversaoDeUnidadesDeTempo.converterMesParaDia(num1));
		System.out.println(ConversaoDeUnidadesDeTempo.converterAnoParaDia(num1));
		
	}

}
