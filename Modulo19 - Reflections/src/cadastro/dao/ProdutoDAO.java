package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    public ProdutoDAO(){
        super();
        this.map = new HashMap<>();
        Map<Long, Produto> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto produto, Produto produtoCadastrado) {
        produtoCadastrado.setNome(produto.getNome());
    }
}
