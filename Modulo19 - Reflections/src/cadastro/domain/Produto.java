package cadastro.domain;

import cadastro.anotacao.TipoChave;

public class Produto implements Persistente{

    @TipoChave("getCodigo")
    private Long codigoProduto;

    private String nome;

    public Produto(String codigoProduto, String nome) {
        this.codigoProduto = Long.valueOf(codigoProduto);
        this.nome = nome;
    }

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


//    @Override
//    public Long getCodigo() {
//        return this.codigoProduto;
//    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto=" + codigoProduto +
                ", nome='" + nome + '\'' +
                '}';
    }
}
