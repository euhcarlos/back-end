package templatemethod;

public abstract class Trabalhador {
    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected void iniciarRotina() {
    }

    protected void levantar() {
    }

    protected void irAoTrabalho() {
    }

    protected abstract void trabalhar();

    protected void voltarParaCasa() {
    }
}
