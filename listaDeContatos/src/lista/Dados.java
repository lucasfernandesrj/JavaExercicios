package lista;

import java.util.ArrayList;

public class Dados {
	ArrayList<Contato> listaContatos = new ArrayList<Contato>();
	
	public void cadastrarContato(Contato novo) {
		listaContatos.add(novo);
	}
	public int numeroDoContato(){
		return listaContatos.size();
	}
	public void mostraContato() {
		for(Contato c: listaContatos) {
			System.out.println(c.toString());
		}
		
	}
}
