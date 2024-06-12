package cadastro.dao.generic;

import cadastro.domain.Cliente;
import cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastro(T entity);

    public void alterar(T entity);

    public void excluir(Long valor);

    public T consultar(Long valor);

    public Collection<T> buscarTods();

}
