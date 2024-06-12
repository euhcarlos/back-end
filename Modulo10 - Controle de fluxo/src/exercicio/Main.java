package exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar media de aluno? (Sim/Não): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite a nota do primeiro bimestre: ");
            Double primeiro_bimestre = s.nextDouble();

            System.out.println("Digite a nota do segundo bimestre: ");
            Double segundo_bimestre = s.nextDouble();

            System.out.println("Digite a nota do terceiro bimestre: ");
            Double terceiro_bimestre = s.nextDouble();

            System.out.println("Digite a nota do quarto bimestre: ");
            Double quarto_bimestre = s.nextDouble();

            Double media = (primeiro_bimestre + segundo_bimestre + terceiro_bimestre + quarto_bimestre) / 4;

            if(media >= 7){
                System.out.println("Resultado: Aprovado" + "Nota: " + media);
            } else {
                System.out.println("Resultado: Reprovado" + "Nota: " + media);
            }

            System.out.println("Deseja gerar mais medias? (Sim/Não): ");
            resposta = s.next();
        }
    }
}
