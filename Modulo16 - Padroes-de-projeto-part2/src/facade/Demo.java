package facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new AparatamentoService();
        service.cadastraApartamento(new Apartamento(1l, "End"));
    }
}
