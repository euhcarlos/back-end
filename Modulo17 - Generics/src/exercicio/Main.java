package exercicio;

public class Main {

    public static void main(String[] args) {
        ListaDeCarros listaDeCarros = new ListaDeCarros<>();

        Fiat fiat = new Fiat("Fiat", "Strada");
        Honda honda = new Honda("Honda", "Civic");

        listaDeCarros.setCarros(fiat);
        listaDeCarros.setCarros(honda);

        System.out.println(listaDeCarros);

    }
}
