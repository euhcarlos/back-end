package interfaces.veiculos;

public class Caminhao implements IVeiculos{
    @Override
    public void andar(String veiculo) {
        System.out.println(veiculo + "Está andando");
    }
}
