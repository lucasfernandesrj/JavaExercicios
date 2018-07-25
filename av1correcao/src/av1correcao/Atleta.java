package av1correcao;

public class Atleta {
	private static int cont = 0;
	int numero;
	String nome;
	double peso;
	double altura;
	int sexo;
	
	public Atleta(String nome, double peso, double altura, int sexo) throws Exception{
		this.numero = ++cont;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		setSexo(sexo);
	}
	
	
	
	public void setPeso(double valor) throws Exception{
		if(valor >= 0) {
			this.peso = valor;
		}else {
			throw new Exception("Valor abaixo de zero!");
		}
	}
	public void setSexo(int valor) throws Exception {
		if(sexo == 1 || sexo == 2) {
			this.sexo = valor;
		}else {
			throw new Exception("O sexo é inválido");
		}
	}
	public void imprime() {
		System.out.println("Nome:"+this.nome+" Peso:"+this.peso+" Altura:"+this.altura+" Sexo:"+this.sexo);
	}

	public static void setCont(int cont) {
		Atleta.cont = cont;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws Exception {
		if(altura > 0) {
			this.altura = altura;
		}else {
			throw new Exception("Altura inválida!");
		}
	}

	public double getPeso() {
		return peso;
	}

	public int getSexo() {
		return sexo;
	}
	
}
