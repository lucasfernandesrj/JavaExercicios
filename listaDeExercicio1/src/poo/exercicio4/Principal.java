package poo.exercicio4;

public class Principal {

	public static void main(String[] args) {
		VeiculoAVenda vv = new VeiculoAVenda("Bicicleta",2010, 54000);
		AutomovelAVenda av = new AutomovelAVenda(2015, 30000);
		MotocicletaAVenda mv = new MotocicletaAVenda(2001, 8000);
		System.out.println(av.toString());
		System.out.println(mv.toString());
		System.out.println(vv.toString());
		

	}

}
