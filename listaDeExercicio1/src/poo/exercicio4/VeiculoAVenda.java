package poo.exercicio4;

public class VeiculoAVenda {
	private String tipo;
	private int ano;
	private double precoDeVenda;
	
	
	
	public VeiculoAVenda(String tipo, int ano, double precoDeVenda) {
		this.tipo = tipo;
		this.ano = ano;
		this.precoDeVenda = precoDeVenda;
	}
	public VeiculoAVenda(int ano, double precoDeVenda) {
		this.ano = ano;
		this.precoDeVenda = precoDeVenda;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	@Override
	public String toString() {
		return "VeiculoAVenda [tipo=" + tipo + ", ano=" + ano + ", precoDeVenda=" + precoDeVenda + "]";
	}
	
	
}
