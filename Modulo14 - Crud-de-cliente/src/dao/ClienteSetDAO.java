package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteSetDAO implements ICliente{

    private Set<Cliente> set;

    public ClienteSetDAO(){
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastro(Cliente cliente) {
        for(Cliente clienteCadastro : this.set){
            if(clienteCadastro.getCpf().equals(cliente.getCpf())){
                return false;
            }
        }
        this.set.add(cliente);
        return true;
    }

    @Override
    public void alterar(Cliente cliente) {
        if(this.set.contains(cliente)){
            for(Cliente clienteCadastrado : this.set){
                if(clienteCadastrado.equals(cliente)){
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setCpf(cliente.getCpf());
                    clienteCadastrado.setTelefone(cliente.getTelefone());
                }
            }
        }
    }

    @Override
    public void excluir(Long cpf) {
        for(Cliente cliente : this.set){
            if(cliente.getCpf().equals(cpf)){
                this.set.remove(cliente);
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for(Cliente cliente : this.set){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTods() {
        return this.set;
    }
}
