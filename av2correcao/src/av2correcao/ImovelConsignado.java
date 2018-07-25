package av2correcao;

import corejava.Console;

public class ImovelConsignado implements Imovel{
	
	private int numero = 0;
	private String bairro, cidade, estado, endereco;
	private double areaUtil, areaTotal,valor;
	private String dataLancamento;
	
	public ImovelConsignado(int numero, String bairro, String cidade, String estado, String endereco,double areaUtil, double areaTotal, double valor, String dataLancamento) throws Exception {
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		if(areaUtil > areaTotal) {
			throw new Exception("A areaUtil não pode ser superior a areaTotal");
		}else {
			this.areaUtil = areaUtil;
			this.areaTotal = areaTotal;
		}
		this.valor = valor;
		this.dataLancamento = dataLancamento;
	}

	public void lancarDados(int numero) throws Exception{
		this.numero = numero;
		this.bairro = Console.readLine("Informe o bairro");
		this.cidade = Console.readLine("Informe a cidade");
		this.estado = Console.readLine("Informe o estado");
		this.endereco = Console.readLine("Informe o endereco");
		double autil = Console.readDouble("Informe a Area Util");
		double atotal = Console.readDouble("Informe a Area Total");
		if(autil > atotal) {
			throw new Exception("Erro!Area Util superior a Area Total");
		}else {
			this.areaUtil = autil;
			this.areaTotal = atotal;
		}
		this.valor = Console.readDouble("Informe o valor");
		this.dataLancamento = Console.readLine("Informe a Data de Lançamento");
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getAreaUtil() {
		return areaUtil;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaUtil(double areaUtil) throws Exception {
		if(areaUtil > getAreaTotal()) {
			throw new Exception("AreaUtil não pode ser maior que a AreaTotal!");
		}
		this.areaUtil = areaUtil;
	}
	
	public void setAreaTotal(double areaTotal)throws Exception{
		if(areaTotal < getAreaUtil()) {
			throw new Exception("AreaTotal não pode ser menor que a AreaUtil!");
		}else {
			this.areaTotal = areaTotal;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	@Override
	public String toString() {
		return "ImovelConsignado [numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", endereco=" + endereco + ", areaUtil=" + areaUtil + ", areaTotal=" + areaTotal + ", valor=" + valor
				+ ", dataLancamento=" + dataLancamento + "]";
	}
	
}
