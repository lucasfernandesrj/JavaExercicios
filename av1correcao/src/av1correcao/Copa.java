package av1correcao;

import java.util.ArrayList;

import corejava.Console;

public class Copa {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Selecao>listaSelecoes = new ArrayList<Selecao>();
		ArrayList<Atleta>listaAtleta = new ArrayList<Atleta>();
		
		int resp = Console.readInt("1-Incluir um atleta, 2-Adicionar em uma seleção ou 3-ListarTodas as Selecoes");
		if(resp == 1) {
			String nome = Console.readLine("Informe um nome:");
			double peso = Console.readDouble("Informe um peso:");
			double altura = Console.readDouble("Informe um altura:");
			int sexo = Console.readInt("Informe um sexo (1-M ou 2-F):");
			Atleta x = new  Atleta(nome,peso,altura,sexo);
			listaAtleta.add(x);
		}else if(resp == 2) {
			int numAtleta = Console.readInt("Informe o número do Atleta: ");
			int numSelecao = Console.readInt("Informe o número da Seleção: ");
			Atleta obj = listaAtleta.get(numAtleta);
			Selecao sel = listaSelecoes.get(numSelecao);
			sel.adicionaAtleta(obj);
		}else if(resp == 3) {
			for(Selecao y:listaSelecoes) {
				y.imprime();
			}
		}else{
			System.out.println("Valor Inválido!");
		}
		
	}

}
