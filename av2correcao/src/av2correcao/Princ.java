package av2correcao;

public class Princ {

	public static void main(String[] args) throws Exception {
		ImovelConsignado i1 = new ImovelConsignado(1,"maria paula","niteroi","rio de janeiro","rua mario nardeli",10,15,540468.50,"20/12/2018");
		System.out.println(i1.toString());
		i1.lancarDados(1);
	}

}
