package factory;

public class SemContratoFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Civic(100, "cheio", "preto");
        } else {
            return new Camaro(20, "meio tanque", "vermelho");
        }
    }
}
