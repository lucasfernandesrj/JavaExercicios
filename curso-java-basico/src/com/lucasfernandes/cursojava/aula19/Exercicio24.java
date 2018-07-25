package com.lucasfernandes.cursojava.aula19;

public class Exercicio24 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean igual = true;
		String palindromo = "";
		a[0]=0;
		a[1]=0;
		a[2]=0;
		a[3]=0;
		a[4]=1;
		a[5]=1;
		a[6]=0;
		a[7]=0;
		a[8]=0;
		a[9]=0;
		
		for(int i=0;i<(a.length/2);i++) {
			if(a[i] != a[(a.length-1-i)]) {
				igual = false;
				break;
			}
		}
		
		/*for(int i=0,j=(a.length-1);i<a.length;i++,j--) {
			if(a[i] == a[j]) {
				palindromo += ""+a[i]+" ";
			}else {
				igual = false;
				palindromo += "\nSequencia diferente na posição a["+i+"] e a["+j+"].";
				break;
			}
		}*/
		System.out.println("O vetor é palindromo? "+igual);
		System.out.println(palindromo);
		
	}

}
