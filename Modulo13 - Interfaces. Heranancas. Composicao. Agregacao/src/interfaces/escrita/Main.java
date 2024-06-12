package interfaces.escrita;

public class Main {

    public static void main(String args[]){
        IEscrita caneta = new Caneta();
        caneta.escrever("Carlos eduardo");
        caneta.getCor();

        IEscrita giz = new Giz();
        giz.escrever("Valor");
        giz.getCor();

    }
}
