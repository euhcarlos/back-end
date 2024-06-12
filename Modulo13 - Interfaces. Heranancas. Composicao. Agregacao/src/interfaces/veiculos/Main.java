package interfaces.veiculos;

public class Main {
    public static void main(String args[]){
        Carro carro = new Carro();
        IVeiculos carro2 = new Carro();
        carro.andar("Carro");
        carro.parar("Carro");

        Caminhao caminhao = new Caminhao();
        caminhao.parar("Caminhão");
        caminhao.andar("Caminhão");
    }
}
