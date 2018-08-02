package com.lucasfernandes.cursojava.aula36.teste;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("John Snow");
		//contato.setEndereco("Winterfell");
		//contato.setTelefone("21 9999-9999");
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Got");
		end.setNumero("n/a");
		end.setComplemento("Norte");
		end.setCidade("Winterfell");
		end.setEstado("Westeros");
		end.setCep("55545-123");
		
		Telefone tel = new Telefone();
		tel.setDdd("21");
		tel.setNumero("6666-5555");
		tel.setTipo("Fixo");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("21");
		tel2.setNumero("1111-5555");
		tel2.setTipo("Celular");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setEndereco(end);
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+t.getNumero());
			}
		}
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
	}

}
