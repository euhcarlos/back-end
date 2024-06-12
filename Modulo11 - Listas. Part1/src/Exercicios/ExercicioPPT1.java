package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPPT1 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("DESEJA CADASTRAR UM USUARIO? (S/N):");
        String resposta = s.next();

        List<String> usuariosM = new ArrayList<>();
        List<String> usuarioF = new ArrayList<>();

        while (resposta.equalsIgnoreCase("S")){
            System.out.println("DIGITE UM NOME E SEXO SEPARADOS POR VIRGULA (EXEMPLO:Antonio,Masculino");
            String usuario = s.next();

            String[] dados = usuario.split(",");

            if(dados[1].equalsIgnoreCase("Masculino")){
                usuariosM.add(dados[0]);
            } else if(dados[1].equalsIgnoreCase("Feminino")){
                usuarioF.add(dados[0]);
            }

            System.out.println("DESEJA COLOCAR MAIS NOMES?: ");
            resposta = s.next();
        }

        System.out.println("LISTA MASCULINA: " + usuariosM);
        System.out.println("LISTA FEMININA: " + usuarioF);
    }
}
