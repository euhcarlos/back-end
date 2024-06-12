package observer;

public class Jornal implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recenbendo noticia no jornal");
    }
}
