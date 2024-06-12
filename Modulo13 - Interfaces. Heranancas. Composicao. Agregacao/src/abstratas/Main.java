package abstratas;

public class Main {

    public static void main(String args[]){
        Assalariado assalariado = new Assalariado();
        assalariado.setCpf(1);
        assalariado.setNome("Carlos");
        assalariado.setSobrenome("Eduardo");
        assalariado.setSalario(100d);
        imprimir(assalariado);

        Horista horista = new Horista();
        horista.setCpf(1);
        horista.setNome("Carlos");
        horista.setSobrenome("Eduardo");
        horista.setHoraTrabalhada(10d);
        horista.setValorHora(100d);
        imprimir(horista);
    }

    private static void imprimir(Empregado empregado) {
        System.out.println(empregado.getClass().getSimpleName());
        System.out.println(empregado.vencimento());

        empregado.imprimirValor();
    }

}
