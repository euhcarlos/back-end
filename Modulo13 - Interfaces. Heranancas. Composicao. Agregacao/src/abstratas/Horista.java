package abstratas;

public class Horista extends Empregado {

    private Double valorHora;

    private Double horaTrabalhada;
 
    @Override
    public Double vencimento() {
        return valorHora * horaTrabalhada;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }
}
