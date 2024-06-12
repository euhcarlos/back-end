package forewhile;

import java.util.Scanner;

public class ExemploForTabuada {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero para gerar a tabuada: ");
        int valor = s.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(valor + "x" + i + " = " + valor*i);
        }
    }
}
