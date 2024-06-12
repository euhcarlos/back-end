package templatemethod;

public class Bombeiro extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhar como policial");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantar da camas as 08");
    }
}
