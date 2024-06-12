package interfaces.veiculos;

public interface IVeiculos {

    public void andar(String veiculo);

    default void parar(String veiculo){
        System.out.println(veiculo + "Parou");
    }
}
