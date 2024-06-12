package abstratas;

public abstract class Empregado {

    private String nome;

    private String sobrenome;

    private Integer cpf;

    public abstract Double vencimento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void imprimirValor(){
        Double valor = vencimento();
        System.out.println(valor);
    }
}
