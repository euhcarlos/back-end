package br.com.ceduardo;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void teste(){
        String nome = "Carlos";
        Assert.assertEquals("Carlos", nome);
    }

    @Test
    public void testeNoEqual(){
        String nome = "Carlos";
        Assert.assertNotEquals("Carlos Eduardo", nome);
    }
}
