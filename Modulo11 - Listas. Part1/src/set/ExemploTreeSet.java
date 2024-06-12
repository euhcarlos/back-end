package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    public static void exemploListaSimples(){
        System.out.println("*** EXEMPLO LISTA SIMPLES ****");

        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        lista.add("João da Silva");

        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesOrdemAscendente(){
        System.out.println("*** EXEMPLO LISTA SIMPLES ORDEM ASCENDENTE ****");

        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        lista.add("João da Silva");

        System.out.println(lista);
        //Collections.sort(lista);
        System.out.println("");
    }
}
