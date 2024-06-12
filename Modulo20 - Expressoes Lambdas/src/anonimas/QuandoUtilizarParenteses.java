package anonimas;

public class QuandoUtilizarParenteses {

    /*
    * Usa-se chaves, quando a mais de uma linha na expressão lambda
    * Se tiver retorno, tambem usa-se
    * */

    public static void main(String[] args) {
        MyEventeConsumer myEventeConsumer = (Object s) -> {
            System.out.println(s);
        };

        MyEventeConsumer myEventeConsumer2 = (s) -> {
            System.out.println(s);
        };

        MyEventeConsumer myEventeConsumer3 = (s) -> System.out.println(s);

        MyEnventCostumerReturn ret = s ->{
            System.out.println(s);
            System.out.println(s);
            return s;
        };

        ret.costumer(1);

        MyEnventCostumerReturn<String> rets = s ->{
            System.out.println(s);
            System.out.println(s);
            return "Ola";
        };
    }
}
