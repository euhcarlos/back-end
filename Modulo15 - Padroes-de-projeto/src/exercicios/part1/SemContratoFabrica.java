package exercicios.part1;

public class SemContratoFabrica extends Fabrica{
    @Override
    Carro recuperarCarro(String tipoDeContrato) {
        if("A".equals(tipoDeContrato)){
            return new Mobi("Preto", "11", 100);
        } else {
            return new Corsa("Cinza", "20", 100);
        }
    }
}
