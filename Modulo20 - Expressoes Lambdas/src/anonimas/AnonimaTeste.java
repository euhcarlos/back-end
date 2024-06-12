package anonimas;

import java.util.Objects;

public class AnonimaTeste {

    public static void main(String[] args) {
        MyEventeConsumer myEventeConsumer = new MyEventeConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        myEventeConsumer.consumer("Teste Carlos");

        MyEventeConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste Lambda");

        receberInterface(Boolean.TRUE , value -> System.out.println(value));
        receberInterface(10 , value -> System.out.println(value));
    }

    private static void receberInterface(Object o, MyEventeConsumer anonumaLambda){
        anonumaLambda.consumer(o);
    }
}
