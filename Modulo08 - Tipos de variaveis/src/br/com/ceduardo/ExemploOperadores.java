package br.com.ceduardo;

public class ExemploOperadores {

    public static void main(String args[]){
        operacaoAritmetica();
        operacaoAtribuicao();
        operacaoIncrementoeDecremento();
        operacaoRelacional();
        operacaoLogico();
    }

    private static void operacaoLogico(){
        System.out.println("**** Operadores Logicos ****");

        int num1 = 10;

        boolean isDentro10 = num1 >= 0 && num1 <= 10;
        System.out.println(isDentro10);

        boolean isDentro1_0 = num1 >= 0 || num1 <= 10;
        System.out.println(isDentro10);

    }

    private static void operacaoRelacional() {
        System.out.println("**** Operadores Relacionais ****");

        int n1 = 10;
        int n2 = 10;
        boolean isMaior = n1 > n2;
        boolean isMenor = n1 < n2;
        boolean isIgual = n1 == n2;
        boolean isMenorIgual = n1 <= n2;
        boolean isMaiorIgual = n1 >= n2;
        boolean isDiferente = n1 != n2;

        System.out.println("IsMaior: " + isMaior);
        System.out.println("IsMenor: " + isMenor);
        System.out.println("IsIgual: " + isIgual);
        System.out.println("IsMenorIgual: " + isMenorIgual);
        System.out.println("IsMaiorIgual: " + isMaiorIgual);
        System.out.println("IsDiferente: " + isDiferente);
    }

    private static void operacaoIncrementoeDecremento() {
        System.out.println("**** Operadores de Incremento e Decremento ****");

        int num = 10;
        System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
    }

    private static void operacaoAtribuicao() {
        System.out.println("**** Operadores de Atribuição ****");
        int n = 10;
        int n1 = 10;
        int n2 = n1 + n;
        System.out.println(n2);
        n2 += n1;
        System.out.println(n2);
        int n3 = 10;
        int n4 = 10;
        n4 -= n3;
        System.out.println(n4);
        n4 *= n3;
        System.out.println(n4);
        n4 /= n3;
        System.out.println(n4);
    }

    private static void operacaoAritmetica() {
            System.out.println("**** Operadores Aritmeticos ****");
            int num1 = 10;
            int num2 = 20;

            int resultado = num1 + num2;
            int resultado2 = num2 - num1;
            int resultado3 = num2 * num1;
            int resultado4 = num2 / num1;

            System.out.println(resultado);
            System.out.println(resultado2);
            System.out.println(resultado3);
            System.out.println(resultado4);

    }


}
