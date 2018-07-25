package com.lucasfernandes.cursojava.aula19;

public class Exercicio15 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int par = 0;
		int impar = 0;
		System.out.print("Vetor: ");
		for(int i=0;i<a.length;i++) {
			a[i]= (int) Math.round(Math.random()*10);
			
			if(a[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			System.out.print(a[i]+" ");
		}
		double porImpar = (double) (impar*100/a.length);
		System.out.println("\nÍmpar(es): "+impar+" = "+porImpar+"% \nPar(es): "+par+" = "+(100-porImpar)+"%");
	}

}
