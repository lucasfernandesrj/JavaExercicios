package poo.exercicio3;

public class Principal {

	public static void main(String[] args) {
		
		//ContaBancariaSimplificada conta = new ContaBancariaSimplificada();
		ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("lucas ramos fernandes","1345864-45","Especial",500);
		
		//System.out.println(conta.toString());
		System.out.println(conta2.toString());
		
		//System.out.println(conta.toString());
		//conta.deposita(540);
		//System.out.println(conta.toString());
		//conta.retira(430);
		conta2.deposita(40);
		System.out.println(conta2.toString());
		conta2.retira(1600);
		System.out.println(conta2.toString());

	}

}
