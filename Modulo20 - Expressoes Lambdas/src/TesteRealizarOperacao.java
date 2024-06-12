import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TesteRealizarOperacao {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,7,4,11,18);
        System.out.println("Multiplicar todos os elementos da lista por 5: ");
        realizarOperacao(list, (n)->n + 5);

        System.out.println("Somar todos os elementos da lista com 3: ");
        realizarOperacao(list, (n)-> n + 3);

        System.out.println("Trocando todos por 0: ");
        realizarOperacao(list, (n)-> 0);
    }

    private static void realizarOperacao(List<Integer> list, IntFunction<Integer> function) {
        list.forEach(n -> {
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}
