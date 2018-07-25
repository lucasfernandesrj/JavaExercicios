package av2correcao;

public interface Imovel {
	/*private int numero = 0;
	private String bairro, cidade, estado, endereco;
	private double areaUtil, areaTotal,valor;
	private String dataLancamento;
	
	public Imovel(int numero, String bairro, String cidade, String estado, String endereco,double areaUtil, double areaTotal, double valor, String dataLancamento) throws Exception {
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		if(areaUtil > areaTotal) {
			throw new Exception("A areaUtil não pode ser superior a areaTotal");
		}else {
			this.areaUtil = areaUtil;
		}
		//setAreaUtil(areaUtil);
		this.areaTotal = areaTotal;
		this.valor = valor;
		this.dataLancamento = dataLancamento;
	}*/

	public abstract void lancarDados(int numero) throws Exception;
}
