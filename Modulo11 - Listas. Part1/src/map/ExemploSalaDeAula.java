package map;

import domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaDeAula {
    public static void main(String args[]){
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();
        List<Aluno> alunoSala1 = criarTurma("Carlos Eduardo", "Linux", 10);

        listaSala.put(1,alunoSala1);
        imprimirAlunoSala(listaSala.get(1));
    }

    private static void imprimirAlunoSala(List<Aluno> aluno) {
        aluno.forEach(alunos->{
            System.out.println("Nome: " + alunos.getNome() + " - " + "Nota: " + alunos.getNota());
        });
    }

    private static List<Aluno> criarTurma(String nome, String curso, int nota) {
        List<Aluno> dado = new ArrayList<>();
        Aluno aluno = new Aluno(nome, curso, nota);
        dado.add(aluno);
        return dado;
    }
}
