package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements ICliente{

    private Map<Long, Cliente> map;

    public ClienteMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastro(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if(clienteCadastrado != null){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if(clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if(clienteCadastrado != null){
            return clienteCadastrado;
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTods() {
        return this.map.values();
    }
}
