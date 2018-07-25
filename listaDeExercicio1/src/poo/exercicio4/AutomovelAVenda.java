package poo.exercicio4;

public class AutomovelAVenda extends VeiculoAVenda{
	
	public AutomovelAVenda(int ano, double precoDeVenda) {
		super(ano,precoDeVenda);
		super.setTipo("Automovel");
	}
}
