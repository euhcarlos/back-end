package exception;

import java.awt.*;

public class comTratamentoException {
    public static void main(String[] args) {
        comTratamentoException();
        comTratamentoComFinally();
        lancarRunTimeExpetion();
        System.out.println("Teste");
    }

    private static void lancarRunTimeExpetion() {
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e){
            throw new RuntimeException("Parando o sistema");
        }
        System.out.println("Teste");
    }

    private static void comTratamentoComFinally() {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e){
            System.out.println("A frase inical esta vazia, colocamos um valor para resolver o erro");
            frase = "Frase vazia";
        }finally {
            novaFrase = frase.toUpperCase();
        }
    }

    public static void comTratamentoException(){
        String frase = null;
        String novaFrase = null;

        try{
            novaFrase = frase.toUpperCase();
        }catch(NullPointerException e){
            System.out.println("A frase esta vazia, colocamos um valor para resolver");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase: "+ frase);
        System.out.println("Nova frase: " + novaFrase);
    }
}
