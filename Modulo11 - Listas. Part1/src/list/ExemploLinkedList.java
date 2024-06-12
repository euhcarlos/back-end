package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdenada();
    }

    private static void exemploListaSimplesOrdenada() {
        System.out.println("**** Exemplo Lista Simples Ordenada ****");
        List<String> lista = new LinkedList<>();
        lista.add("Carlos Eduardo");
        lista.add("Jaqueline Batista");

        Collections.sort(lista);
        System.out.println(lista);


        lista.remove(0);
        System.out.println(lista);

        Boolean contain = lista.contains("Carlos Eduardo");
        System.out.println(contain);

        for(String nome : lista){
            System.out.println(nome);
        }

        System.out.println(lista.get(0));
    }

    private static void exemploListaSimples(){
        System.out.println("**** Exemplo Lista Simples ****");
        List<String> lista = new LinkedList<>();
        lista.add("Jaqueline Batista");
        lista.add("Carlos Eduardo");
        System.out.println(lista);
        System.out.println("");
    }
}
