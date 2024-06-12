package singleton;

public class DemoSingletonPropriedade {

    public static void main(String[] args) {
        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Carlos");
        System.out.println(singletonPropriedade.getValue());
        SingletonPropriedade singletonPropriedade1 = SingletonPropriedade.getInstance("Carlos Eduardo");
        System.out.println(singletonPropriedade1.getValue());
    }
}
