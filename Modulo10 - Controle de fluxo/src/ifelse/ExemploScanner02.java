package ifelse;

import java.util.Scanner;

public class ExemploScanner02 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = s.next();

        System.out.println("\nDigite sua altura");
        Double altura = s.nextDouble();

        System.out.println("Nome: " + nome + "," + "Altura: " + altura);
    }
}
