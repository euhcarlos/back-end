package exercicios.part1;

import factory.Car;
import factory.Customer;

public class Demo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.getTipoDeContrato());
        carro.andar();
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if(cliente.isCompaniaContrato()){
            return new ContratoFabrica();
        } else {
            return new SemContratoFabrica();
        }
    }
}
