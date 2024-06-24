package br.com.ceduardo;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {

    @Test
    public void test2(){
        String nome = "Carlos";
        Assert.assertEquals("Carlos", nome);
    }
}
