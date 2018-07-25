package av2correcao;

import java.util.ArrayList;

public class Comprador {
	private int numero;
	private String endereco, cpf, cidade, bairro, estado, telefone, email;
	ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	
	public Comprador(int numero, String endereco, String cpf, String cidade, String bairro, String estado, String telefone, String email, Imovel imoveis) throws Exception {
		this.numero = numero;
		this.endereco = endereco;
		this.cpf = cpf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.telefone = telefone;
		this.email = email;
		this.imoveis.add(imoveis);
		if(this.imoveis.isEmpty()) {
			throw new Exception("Cada comprador deve possuir um Imovel");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
