package Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioPPT3 {

    public static void main(String args[]){
        adicionandoPeloGenero();
    }

    private static void adicionandoPeloGenero() {
        Scanner s = new Scanner(System.in);

        Map<String,String> cadastro = new HashMap<>();
        System.out.println("DESEJA ADICIONAR PESSOAS(S/N) ?: ");
        String resposta = s.next();


        while (resposta.equalsIgnoreCase("S")){
            System.out.println("DIGITE UM NOME E UM SEXO (Nome,(F/M): ");
            String dado = s.next();

            String[] pessoa = dado.split(",");

            cadastro.put(pessoa[1], pessoa[0]);

            System.out.println("DESEJA ADICIONAR MAIS?: ");
            resposta = s.next();


        }

    }
}
