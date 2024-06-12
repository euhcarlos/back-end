package exercicios.part1;

public class Cliente {

    private String tipoDeContrato;
    private boolean companiaContrato;

    public Cliente(String tipoDeContrato, boolean companiaContrato) {
        this.tipoDeContrato = tipoDeContrato;
        this.companiaContrato = companiaContrato;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public boolean isCompaniaContrato() {
        return companiaContrato;
    }
}
