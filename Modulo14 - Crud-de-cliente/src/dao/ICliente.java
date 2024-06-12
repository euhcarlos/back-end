package dao;

import domain.Cliente;

import java.util.Collection;

public interface ICliente {

    public Boolean cadastro(Cliente cliente);

    public void alterar(Cliente cliente);

    public void excluir(Long cpf);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTods();

}
