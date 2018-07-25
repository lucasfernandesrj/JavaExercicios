package poo.exercicio1;

public class Principal {

	public static void main(String[] args) {
		Contador cont = new Contador(515);
		
		cont.imprimir();
		cont.incrementarContador(51);
		cont.imprimir();
		cont.incrementarContador(58);
		cont.zerarContador();
		cont.incrementarContador(36);
		cont.imprimir();
	}

}
