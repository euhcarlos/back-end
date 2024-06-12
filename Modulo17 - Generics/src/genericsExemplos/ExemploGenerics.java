package genericsExemplos;

import genericsExemplos.fruta.Banana;
import genericsExemplos.fruta.IFruta;
import genericsExemplos.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(10l);
        listaLong.add(20l);
        imprimir(listaLong);

        System.out.println(pegarPrimeirodaLista(lista));

        List<IFruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());

    }

    //So pega objetos que extendão de determinada classe
    public static void imprimirFrutas(List<? extends IFruta> lista){
        for(IFruta fruta : lista){
            System.out.println(fruta);
        }
    }

    //Um generic que permite ser passado qualque valor
    public static void imprimir2(List<?> lista){
        for(Object st : lista){
            System.out.println(st);
        }
    }

    public static <T> void imprimir(List<T> lista){
        for(T st : lista){
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeirodaLista(List<T> lista){
        return lista.get(0);
    }
}
