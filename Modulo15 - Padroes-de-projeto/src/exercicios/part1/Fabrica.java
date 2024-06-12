package exercicios.part1;

public abstract class Fabrica {

    public Carro criar(String tipoDeContrato){
        Carro carro = recuperarCarro(tipoDeContrato);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro) {
        carro.andar();
        carro.limpar();
        carro.mecanica();
        return carro;
    }

    abstract Carro recuperarCarro(String tipoDeContrato);
}
