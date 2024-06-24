package exercicio;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

    public void filtraMulher(){
        List<Pessoa> listaDePessoas = new ArrayList<>();

        List<Pessoa> listaMulheres = ListaDeNomes.filtraMulheres(listaDePessoas);

        Assert.assertTrue(listaMulheres.stream().allMatch(e -> e.getSexo().equalsIgnoreCase("Feminino")));
    }
}
