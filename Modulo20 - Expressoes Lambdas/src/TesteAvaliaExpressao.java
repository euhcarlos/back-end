import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TesteAvaliaExpressao {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,7,4,11,18);

        System.out.println("Imprimir todos os numeros: ");
        avaliarExpressao(list, (n) -> true);

        System.out.println("Imprimir nenhum numero:");
        avaliarExpressao(list, (n) -> false);

        System.out.println("Imprimir apenas numeros pares: ");
        avaliarExpressao(list, (n)-> n%2 == 0 );

        System.out.println("Imprimir apenas numeros impares: ");
        avaliarExpressao(list, (n)-> n%2 == 1 );
    }

    private static void avaliarExpressao(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(n -> {
            if(predicate.test(n)){
                System.out.println(n + " ");
            }
        });
    }
}
