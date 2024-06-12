package Exercicio;

public class CalculoMedia {
    public static void main(String args[]){
        calculoMedia();
    }

    private static void calculoMedia() {
        double primeiro_bimestre = 10;
        double segundo_bimestre = 8.3;
        double terceiro_bimestre = 4.5;
        double quarto_bimestre = 5;

        double media = (primeiro_bimestre + segundo_bimestre + terceiro_bimestre + quarto_bimestre) / 4;

        System.out.println(media);
    }
}
