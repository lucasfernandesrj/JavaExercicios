package poo.exercicio9;

public class RegistroAcademico {
	private String nomeAluno;
	private int matriculaMatricula;
	private int codigoCurso;
	private double percentualCobranca;
	
	public RegistroAcademico(String nome,int mat,int cod,double perc) {
		this.nomeAluno = nome;
		this.matriculaMatricula = mat;
		setCodigoCurso(cod);
		if(perc >= 0 && perc <= 100) {
			this.percentualCobranca = perc;
		}else {
			this.percentualCobranca = 100;
		}
	}
	
	public void setCodigoCurso(int cod) {
		if(cod == 34 || cod == 39 || cod == 41 || cod == 43 || cod == 45) {
			this.codigoCurso = cod;
		}else {
			this.codigoCurso = 0;
		}
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatriculaMatricula() {
		return matriculaMatricula;
	}

	public void setMatriculaMatricula(int matriculaMatricula) {
		this.matriculaMatricula = matriculaMatricula;
	}

	public double getPercentualCobranca() {
		return percentualCobranca;
	}

	public void setPercentualCobranca(double percentualCobranca) {
		this.percentualCobranca = percentualCobranca;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}
}
