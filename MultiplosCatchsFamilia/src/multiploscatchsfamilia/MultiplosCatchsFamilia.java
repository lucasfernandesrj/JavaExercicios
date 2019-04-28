
package multiploscatchsfamilia;

public class MultiplosCatchsFamilia {

    public static void main(String[] args) {
        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] denom = {2, 0, 4, 8, 0};
        for(int i=0;i<numeros.length;i++){
            try{
               System.out.println(numeros[i]+"/"+denom[i]+"="+(numeros[i]/denom[i]));
            }
            catch(ArrayIndexOutOfBoundsException | ArithmeticException e1){
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
