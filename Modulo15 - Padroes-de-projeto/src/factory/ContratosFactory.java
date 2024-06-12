package factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Corola(100, "cheio", "preto");
        } else {
            return new Mobi(20, "meio tanque", "vermelho");
        }
    }
}
