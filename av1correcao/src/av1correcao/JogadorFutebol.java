package av1correcao;

public class JogadorFutebol extends Atleta {
	private String posicao;
	private String nomeTime;
	
	private JogadorFutebol(String nome, double peso, double altura, int sexo, String posicao,String nomeTime) throws Exception {
		super(nome, peso, altura, sexo);
		this.posicao = posicao;
		this.nomeTime = nomeTime;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	
	
	
}
