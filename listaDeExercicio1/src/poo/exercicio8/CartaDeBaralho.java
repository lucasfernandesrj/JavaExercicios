package poo.exercicio8;

import corejava.Console;

public class CartaDeBaralho {
		public static void main(String[] args) {
		String nomeNaipe = "x";
		String nomeValor = "y";
		int naipe = Console.readInt("Informe o naipe (1-Ouros,2-Paus,3-Copas,4-Espadas):");
		int valor = Console.readInt("Informe o valor:");
		if(valor <= 13) {
			switch(naipe) {
			case 1:
				nomeNaipe = "Ouros.";
				break;
			case 2:
				nomeNaipe = "Paus.";
				break;
			case 3:
				nomeNaipe = "Copas.";
				break;
			case 4:
				nomeNaipe = "Espadas.";
				break;
			default:
				nomeNaipe = "x";
			}
			
			switch(valor) {
			case 1:
				nomeValor = "um Ás";
				break;
			case 11:
				nomeValor = "uma Dama";
				break;
			case 12:
				nomeValor = "um Valete";
				break;
			case 13:
				nomeValor = "um Rei";
				break;
			default:
				nomeValor = "um "+valor;
			}
			
			if(nomeNaipe.equals("x")) {
				System.out.println("Naipe Inválido!");
			}else {
				System.out.println("A sua carta é "+nomeValor+" de "+nomeNaipe);
			}
		}else {
			System.out.println("Valor Inválido!");
		}
		
	}
}
