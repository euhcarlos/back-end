package interfaces.veiculos;

public class Carro implements IVeiculos{

    @Override
    public void andar(String veiculo) {
        System.out.println(veiculo + "Está andando");
    }

    @Override
    public void parar(String veiculo) {
        System.out.println(veiculo + "Está com pneu careca e freio mais devagar");
    }
}
