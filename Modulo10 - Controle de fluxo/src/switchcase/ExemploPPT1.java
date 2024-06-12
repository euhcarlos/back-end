package switchcase;

import java.util.Scanner;

public class ExemploPPT1 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

    }

    public static String getIdade(int idade){
        String result;
        switch (idade){
            case 0:
            case 5:
                result = "Você é um bebe";
                break;
            case 6:
            case 8:
                result = "Você é uma criança";
                break;
            default:
                result = "Você é adulto";
                break;
        }
        return result;
    }
}
