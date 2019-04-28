/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallypegadinha;

/**
 *
 * @author Lucas
 */
public class FinallyPegadinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] denom = {2, 0, 4, 8, 0};
        for(int i=0;i<numeros.length;i++){
            try{
            System.out.println(numeros[i]+"/"+denom[i]+"="+(numeros[i]/denom[i]));
            }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Posição do array inválida");
                System.exit(0);
            }
            finally{
                System.out.println("Terminado a execução do bloco try");
                System.out.println();
            }
        }
    }
    
}
