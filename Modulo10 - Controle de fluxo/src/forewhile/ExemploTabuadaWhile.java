package forewhile;

import java.util.Scanner;

public class ExemploTabuadaWhile {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar um tabuada?(Sim/Não): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite um numero para gerar a tabuada: ");
            int numero = s.nextInt();
            for(int i =0; i <= 10; i++){
                System.out.println(numero + "x" + i + " = " + numero*i);
            }

            System.out.println("Deseja gerar outra tabuada?(Sim/Não): ");
            resposta = s.next();

        }
        System.out.println("Obrigado por usar nosso sistema!");
    }
}
