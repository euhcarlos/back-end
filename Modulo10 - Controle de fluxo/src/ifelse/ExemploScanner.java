package ifelse;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
