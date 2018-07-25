package av2correcao;

public class Analista extends Empregado{
	
	private double valorHora = 0;
	private double horasTrabalhadas = 0;
	private double horasExtras = 0;
	
	public Analista(String nome, double salario, double valorHora, double horasTrabalhadas, double horasExtras) {
		super(nome,salario);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasExtras = horasExtras;
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public void setHorasExtras(double horasExtras){
		this.horasExtras = horasExtras;
	}
	public void imprime(){
		System.out.println("Nome:"+super.getNome()+"Salario:"+ (valorHora* (horasTrabalhadas + (horasExtras*2) ) ) );
	}
}
