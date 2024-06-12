package agregacao;

public class Main {

    public static void main(String args[]){
        Produto produtoTv = criarProduto(1L, 10d, "Tv");
        Produto produtoCel = criarProduto(2L, 100d, "Celular");

        Vendedor vendedor = criarVendedor("Carlos", 10d);

        Comprador comprador = criarComprador("Eduardo",2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoCel);
        venda.add(produtoTv);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
        System.out.println(produtoTv.getNome());
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(long codigo, double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(valor);
        return produto;
    }



}
