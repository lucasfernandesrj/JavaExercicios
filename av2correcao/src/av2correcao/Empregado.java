package av2correcao;

public class Empregado {
	private static int contador = 0;
	private int numero;
	private String nome;
	private double salario;
	
	public Empregado (String nome, double salario) {
		this.numero = ++contador;
		this.nome = nome;
		this.salario = salario;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Empregado.contador = contador;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [numero=" + numero + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
