package exercicios.part1;

public class ContratoFabrica extends Fabrica{
    @Override
    Carro recuperarCarro(String tipoDeContrato) {
        if("A".equals(tipoDeContrato)){
            return new Corola("Preto", "11", 100);
        } else {
            return new Civic("Cinza", "20", 100);
        }
    }
}
