package poo.exercicio1;

public class Contador {
	
	private int contagem = 0;
	
	public Contador() {
		contagem = 0;
	}
	public Contador(int contagem) {
		this.contagem = contagem;
	}
	
	public void zerarContador() {
		this.contagem = 0;
	}
	public void incrementarContador(int numero) {
		this.contagem += numero;
	}
	public void imprimir() {
		System.out.println("Número: "+ contagem);
	}
	public int getContagem() {
		return contagem;
	}
	public void setContagem(int contagem) {
		this.contagem = contagem;
	}
	
}
