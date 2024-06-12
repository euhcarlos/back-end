package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioPPT2 {

    public static void main(String args[]){
        ordenandoOrdemAlfabetica();
    }

    private static void ordenandoOrdemAlfabetica() {
        System.out.println("ORDENANDO POR ORGEM ALFABETICA");

        Scanner s = new Scanner(System.in);

        System.out.println("DESEJA ADICIONAR NOMES?(S/N): ");
        String respota = s.next();

        List<String> listaNomes = new ArrayList<>();

        while (respota.equalsIgnoreCase("S")){
            System.out.println("DIGITE NOMES SEPARADOS POR VIRGULA: ");
            String nomes = s.next();

            String[] nomesSplit = nomes.split(",");

            for(int i = 0; i < nomesSplit.length; i++){
                listaNomes.add(nomesSplit[i]);
            }

            System.out.println("DESEJA ADICIONAR OUTROS NOMES?(S/N): ");
            respota = s.next();
        }

        Collections.sort(listaNomes);
        listaNomes.forEach(e->{
            System.out.println(e);
        });
    }
}
