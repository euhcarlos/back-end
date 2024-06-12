package templatemethod;

public class Policial extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhar como policial");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando 12horas");
    }
}
