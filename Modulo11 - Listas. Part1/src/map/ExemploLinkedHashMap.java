package map;

import java.util.*;

public class ExemploLinkedHashMap {

    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }

    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ITERANDO CHAVES E VALORES ****");
        Map<Integer,String> lista = new LinkedHashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Eduardo Carlos");
        lista.put(3, "Jaqueline Batista");

        System.out.println("**** FOR COMUM ****");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for(Map.Entry<Integer,String> e : entry){
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("**** FOREACH STREAM ****");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("**** FOREACH STREAM 1 ****");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("**** FOREACH STREAM 2 ****");
        lista.values().stream().forEach(System.out::println);

        System.out.println("**** FOREACH STREAM 3 ****");
        lista.forEach((key, value)-> System.out.println("Chave: " + key + " - " + "Valor: " + value));

        System.out.println("**** INTERATOR ****");
        Iterator<Map.Entry<Integer,String>> it = lista.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("**** EXEMPLO LISTA SIMPLES ITERANDO CHAVES ****");
        Map<Integer,String> lista = new LinkedHashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Eduardo Carlos");
        lista.put(3, "Jaqueline Batista");

        for(Integer dado : lista.keySet()){
            System.out.println(dado);
        }
        System.out.println("");
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("**** EXEMPLO LISTA SIMPLES INTERANDO VALORES ****");
        Map<Integer,String> lista = new LinkedHashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Eduardo Carlos");
        lista.put(3, "Jaqueline Batista");

        for(String dado : lista.values()){
            System.out.println(dado);
        }
        System.out.println("");
    }

    public static void exemploListaSimples(){
        System.out.println("**** EXEMPLO LISTA SIMPLES ****");
        Map<Integer,String> lista = new LinkedHashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Eduardo Carlos");
        lista.put(3, "Jaqueline Batista");

        System.out.println(lista);
        System.out.println("");
    }
}
