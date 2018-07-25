package poo.exercicio7;


public class SeriesMatematicas {
	
	public int elevadoA(int x, int y) {
		int resp=x;
		for(int i=1; i<y;i++) {
			resp*=x;
		}
		return resp;
	}
}
