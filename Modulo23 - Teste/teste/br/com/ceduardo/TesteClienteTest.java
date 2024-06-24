package br.com.ceduardo;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.adicionarNomes("Carlos");

        Assert.assertEquals("Carlos", cli.getNome());
    }
}
