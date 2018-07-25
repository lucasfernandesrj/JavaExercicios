package lista;
import java.util.ArrayList;

public class ListaDeContatos {

	public static void main(String[] args) {
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();
		Dados x = new Dados();
		
		Contato contato = new Contato("Lucas", "lucas@hotmail.com", "(21)97476-6531");
		Contato contato1 = new Contato("Maria", "maria@hotmail.com", "(21)97476-6531");
		Contato contato2 = new Contato("Jose", "jose@hotmail.com", "(21)97476-6531");
		Contato contato3 = new Contato("Joao", "joao@hotmail.com", "(21)97476-6531");
		
		x.cadastrarContato(contato);
		x.cadastrarContato(contato1);
		x.cadastrarContato(contato2);
		x.cadastrarContato(contato3);
		
		x.mostraContato();

		System.out.println("Total de itens na lista: "+x.numeroDoContato());
	}
}

/*Contato[] conta = new Contato[4];
conta[0] = new Contato("Lucas", "lucas@hotmail.com", "(21)1111-6666");
conta[1] = new Contato("Maria", "maria@hotmail.com", "(21)2222-5555");
conta[2] = new Contato("Josue", "josue@hotmail.com", "(21)3333-3333");
conta[3] = new Contato("Tadeu", "tadeu@hotmail.com", "(21)4444-1111");

boolean n = listaContatos.add(conta);
System.out.println(n);
System.out.println(conta.length);

for(int i=0;i<conta.length;i++) {
	System.out.println(conta[i]);
}*/

/*contatos.add("Lucas Fernandes");
contatos.add("Mariana Fernandes");
contatos.add("Cristiane Ramos");
contatos.add(1, "Thor");
contatos.add("Raimundo Nonato");

System.out.println("tamanho: "+contatos.size());
System.out.println("Está vazio? "+contatos.isEmpty());
System.out.println(contatos.contains("Lucas Fernandes")); //return boolean
System.out.println(contatos.contains("Lucas"+" "+"Fernandes")); //boolean
System.out.println(contatos.indexOf(" Fernandes")); // return int posicao -1 nao encontrou
System.out.println(contatos.indexOf("Lucas Fernandes")); // zero primeira posicao
System.out.println(contatos.indexOf("Mariana Fernandes"));
System.out.println(contatos.remove(4));
System.out.println(contatos.indexOf("Mariana Fernandes"));*/