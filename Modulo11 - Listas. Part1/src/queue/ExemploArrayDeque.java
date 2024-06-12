package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    
    public static void main(String args[]){
        inserindoNaFila();
        removendoDaFila();
        acessandoDaFila();
    }

    private static void inserindoNaFila() {
        System.out.println("**** REMOVENDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Vermelho");
        ad.add("Azul");
        ad.add("Branco");
        ad.add("Amarelo");
        ad.add("Preto");

        Deque<String> d = new ArrayDeque<>();
        d.add("Verde");
        d.add("Marrom");

        //Adicionar todos os items de uma fila em outra.
        ad.addAll(d);

        String g = ad.remove();
        ad.remove("Preto");

        System.out.println("Itens removidos");

        //Remove o primeiro da fila
        ad.removeFirst();

        //Remove o ultimo da fila.
        ad.removeFirst();
    }

    private static void removendoDaFila() {
        System.out.println("**** ACESSANDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Vermelho");
        ad.add("Azul");
        ad.add("Branco");
        ad.add("Amarelo");
        ad.add("Preto");

        Deque<String> d = new ArrayDeque<>();
        d.add("Verde");
        d.add("Marrom");

        //Adicionar todos os items de uma fila em outra.
        ad.addAll(d);

        //Pega um elemento da fila
        System.out.println(ad.element());

        //Pega o primeiro da fila
        System.out.println(ad.getFirst());

        //Pega o ultimo da fila
        System.out.println(ad.getFirst());

        //Verificando se contem um item
        System.out.println(ad.contains("Vermelho"));

        //Verificando se contem todos os itens de uma lista
        System.out.println(ad.containsAll(d));

        System.out.println(ad);
    }

    private static void acessandoDaFila() {
        System.out.println("**** ADICIONANDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Vermelho");
        ad.add("Azul");
        ad.add("Branco");
        ad.add("Amarelo");
        ad.add("Preto");

        Deque<String> d = new ArrayDeque<>();
        d.add("Verde");
        d.add("Marrom");

        //Adiciona no primeiro
        ad.addFirst("Branco");

        //Adiciona no ultimo
        ad.addLast("Cinza");
    }
}
