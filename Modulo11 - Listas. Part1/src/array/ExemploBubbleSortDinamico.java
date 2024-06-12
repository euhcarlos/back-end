package array;

import java.util.Scanner;

public class ExemploBubbleSortDinamico {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("DIGITE OS NUMEROS SEPARADOS POR VIRGULA: ");
        String respota = s.next();

        String[] vetStr = respota.split(",");
        int[] vet = convert(vetStr);
        int aux = 0;
        int i = 0;

        for(i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length - 1; j++){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("LISTA ORDENADA");
        for(i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }
    }

    private static int[] convert(String[] vetStr) {
        int[] numbers = new int[vetStr.length];
        for(int i = 0;i < vetStr.length;i++) {
            numbers[i] = Integer.parseInt(vetStr[i]);
        }
        return numbers;
    }
}
