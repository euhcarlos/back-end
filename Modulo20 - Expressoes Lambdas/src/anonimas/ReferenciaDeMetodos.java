package anonimas;

public class ReferenciaDeMetodos {

    public static void main(String[] args) {
        MyEventeConsumer myEnvent = s -> System.out.println(s);
        myEnvent.consumer("Ola");

        MyEventeConsumer myEnvent2 = System.out::println;
        myEnvent2.consumer("Ola - 2.0");
    }
}
