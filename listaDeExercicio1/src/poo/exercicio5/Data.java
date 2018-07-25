package poo.exercicio5;

public class Data {
	
	private int ano;
	private int mes;
	private int dia;
	
		public Data(int ano,int mes,int dia) {
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
		}
		
		
	
		public int getAno() {
			return ano;
		}



		public void setAno(int ano) {
			this.ano = ano;
		}



		public int getMes() {
			return mes;
		}



		public void setMes(int mes) {
			this.mes = mes;
		}



		public int getDia() {
			return dia;
		}



		public void setDia(int dia) {
			this.dia = dia;
		}



		public boolean vemAntes(int ano,int mes,int dia){
			if(this.ano < ano) {
				return true;
			}else if(this.ano == ano) {
					if(this.mes < mes) {
						return true;
			}else if(this.mes == mes) {
					if(this.dia <= dia) {
						return true;
					}else {
						return false;
					}
			}
			}else {
				return false;
			}
		return false;
		}



		@Override
		public String toString() {
			return "Data [ano=" + ano + ", mes=" + mes + ", dia=" + dia + "]";
		}
}