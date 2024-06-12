package cadastro.dao.generic;

import cadastro.anotacao.TipoChave;
import cadastro.domain.Cliente;
import cadastro.domain.Persistente;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO(){
        if(this.map == null){
            this.map = new HashMap<>();
        }
    }

    public Long getChave(T entity){
        Field[] field = entity.getClass().getDeclaredFields();
        for(Field fields : field){
            if(fields.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = fields.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    Long value = (Long) method.invoke(entity);
                    return value;
                }catch (NoSuchMethodException | IllegalAccessError | InvocationTargetException | IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public Boolean cadastro(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        if(mapaInterno.containsKey(chave)){
            return false;
        }

        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if(objetoCadastrado != null){
            atualizarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if(objetoCadastrado != null){
            this.map.remove(valor, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTods() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
