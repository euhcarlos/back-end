import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class TesteLambdas {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        intBinaryOperator.applyAsInt(1, 1);
        System.out.println(intBinaryOperator);

        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) ->{
            return a+b;
        };
        Integer resutlBi = biFunction.apply(10,10);
        System.out.println(resutlBi);

        BiFunction<Double, Double, String> biFunctionString = (Double a, Double b) ->{
            Double result = a + b;
            return String.valueOf(result);
        };

        System.out.println(biFunctionString);

        calcular(1l,2l, (Long v1, Long v2)->{
            return v1+v2;
        });

        Runnable hello_world = () -> System.out.println("Hello world");
        Consumer<String> stringConsumer = (String s) ->{
            System.out.println(s);
        };
        stringConsumer.accept("value");

        Supplier<Integer> interCallable = () -> 42;
        Supplier<Double> doubleCallabel = () ->{
            return 3.4545;
        };

    }

    private static Long calcular(Long t, Long u, BiFunction<Long, Long,Long> function){
        return function.apply(t,u);
    }
}
