
package excecao;
public class Excecao {

    public static void main(String[] args) {
        try{
        int vetor[] = new int[4];
        
        System.out.println("Antes da exceção");
        vetor[5]=5;
        System.out.println("Após a exceção");
        }
        catch(java.lang.ArrayIndexOutOfBoundsException Exception){
            System.out.println("Indice informado não existe não existe!");
        }
        System.out.println("Esse texto será executado após a exceção");
    }
    
}
