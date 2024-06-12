package ifelse;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class ExemploIdade {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();

        String resultado = getIdade(idade);
        System.out.println(resultado);
    }

    public static String getIdade(int idade){
        if(idade >= 0 && idade <= 4){
            return "Você é um bebe";
        } else if (idade >= 5 && idade <= 10){
            return "Você é uma criança";
        } else if (idade >= 11 && idade <= 17) {
            return "Você é um adolescente";
        } else if (idade >= 18 && idade <= 32) {
            return "Você é adulto";
        } else {
            return "Você chegou na melhor idade";
        }
    }
}
