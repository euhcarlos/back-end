package composicao;

public class Main {

    public static void main(String args[]){
        Banco banco = new Banco();
        banco.setCodigo(10l);
        banco.setNome("Banco Carlos");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(200d);
        cc.setChequeEspecial(20d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

        banco.add(cc);
        banco.add(cp);

    }
}
