package observer;

public class Tv implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recenbendo noticia na tv");
    }
}
