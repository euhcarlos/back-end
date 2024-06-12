package list;

import domain.Aluno;
import domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

   public static void main(String args[]){
       exemploListaSimples();
       exemploListaSimplesOrdemAscendente();
       exemploListaNumeros();
       exemploListaSimplesAluno();
       exemploListaSimplesAlunoOrdenada();
       exemploListaSimplesAlunoOrdenadaPorNota();
   }

    private static void exemploListaSimplesAlunoOrdenadaPorNota() {
        System.out.println("**** Exemplo Lista Simples Aluno Ordenada Nota ****");

        List<Aluno> aluno = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo", "Exel", 1.2);
        Aluno b = new Aluno("Jaqueline Batista", "Pacote Ofice", 1.2);
        Aluno c = new Aluno("Zefa Alves", "Enfermagem", 1.2);
        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        System.out.println("Lista sem ordem: " + aluno);
        Collections.sort(aluno);
        System.out.println("Lista Ordenada: " + aluno);


        ComparaNotaAluno comparaNota = new ComparaNotaAluno();
        Collections.sort(aluno, comparaNota);
        System.out.println("Lista ordenada por nota: " + aluno);
    }

    private static void exemploListaSimplesAlunoOrdenada() {
        System.out.println("**** Exemplo Lista Simples Aluno Ordenada ****");
        List<Aluno> aluno = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo", "Exel", 1.2);
        Aluno b = new Aluno("Jaqueline Batista", "Pacote Ofice", 1.2);
        Aluno c = new Aluno("Zefa Alves", "Enfermagem", 1.2);
        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        System.out.println(aluno);
        System.out.println("");
        Collections.sort(aluno);
        System.out.println(aluno);
        System.out.println("");
    }

    private static void exemploListaSimplesAluno() {
        System.out.println("**** Exemplo Lista Simples Aluno ****");
        List<Aluno> aluno = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo", "Exel", 1.2);
        Aluno b = new Aluno("Jaqueline Batista", "Pacote Ofice", 1.2);
        Aluno c = new Aluno("Zefa Alves", "Enfermagem", 1.2);
        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        System.out.println(aluno);
        System.out.println("");
    }

    private static void exemploListaNumeros() {
        System.out.println("**** Exemplo Lista Simples Numero ****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** Exemplo Lista Simples ****");
        List<String> lista = new ArrayList<>();
        lista.add("Jaqueline Batista");
        lista.add("Carlos Eduardo");
        lista.add("Josefa Alves");
        System.out.println(lista);
        System.out.println("");
   }

    private static void exemploListaSimples() {
        System.out.println("**** Exemplo Lista Simples ****");
        List<String> lista = new ArrayList<>();
        lista.add("Jaqueline Batista");
        lista.add("Carlos Eduardo");
        lista.add("Josefa Alves");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
