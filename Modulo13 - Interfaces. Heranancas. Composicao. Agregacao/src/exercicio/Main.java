package exercicio;

public class Main {

    public static void main(String args[]){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Carlos");
        pessoaFisica.setCpf(14520l);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Eduardo");
        pessoaJuridica.setCnpj(1544151l);

        System.out.println("Pessoa juridica: " + pessoaJuridica);
        System.out.println("Pessoa Fisica: " + pessoaFisica);
    }
}
