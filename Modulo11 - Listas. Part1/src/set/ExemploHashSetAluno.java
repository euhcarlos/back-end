package set;

import domain.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {

    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesConsulta();
        exemploListaSimplesRemover();
    }

    private static void exemploListaSimplesRemover() {
        System.out.println("**** EXEMPLO LISTA SIMPLES REMOVER ****");

        System.out.println("**** EXEMPLO LISTA SIMPLES ****");

        Set<Aluno> alunos = new HashSet<>();
        Aluno a = new Aluno("Carlos Eduardo", "Linux", 10);
        Aluno b = new Aluno("Eduardo Carlos", "Linux", 8.5);
        Aluno c = new Aluno("Antonio Pereira", "Linux", 4.2);
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        System.out.println(alunos);

        alunos.remove(a);
        System.out.println(alunos);
        System.out.println("");
    }

    private static void exemploListaSimplesConsulta() {
        System.out.println("**** EXEMPLO LISTA SIMPLES CONSULTA ****");

        Set<Aluno> alunos = new HashSet<>();
        Aluno a = new Aluno("Carlos Eduardo", "Linux", 10);
        Aluno b = new Aluno("Eduardo Carlos", "Linux", 8.5);
        Aluno c = new Aluno("Antonio Pereira", "Linux", 4.2);
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        System.out.println(alunos.contains(b));
        System.out.println("");

        for(Aluno dado : alunos){
            System.out.println("ALUNO: " + dado);
        }
    }

    //Para não repetir objetos na lista de alunos e necessario que a classe
    //Aluno implemente o equal e hashcode

    public static void exemploListaSimples(){
        System.out.println("**** EXEMPLO LISTA SIMPLES ****");

        Set<Aluno> alunos = new HashSet<>();
        Aluno a = new Aluno("Carlos Eduardo", "Linux", 10);
        Aluno b = new Aluno("Eduardo Carlos", "Linux", 8.5);
        Aluno c = new Aluno("Antonio Pereira", "Linux", 4.2);
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        System.out.println(alunos);
        System.out.println("");
    }
}
