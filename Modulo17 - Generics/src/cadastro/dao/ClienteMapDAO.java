package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO(){
        super();
        this.map = new HashMap<>();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if(mapaInterno == null){
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente clienteCadastrado) {
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setCpf(cliente.getCpf());
        clienteCadastrado.setTelefone(cliente.getTelefone());
    }
}
