package interfaces.escrita;

public class Giz implements IEscrita{
    @Override
    public void escrever(String texto) {
        System.out.println("Escevendo: " + texto + " " + "Na classe: " + getClass().getSimpleName());
    }

    @Override
    public void getCor() {
        System.out.println("Branco");
    }
}
