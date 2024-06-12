package exercicio;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T> {

    private List<T> carros;

    public ListaDeCarros(){
        this.carros = new ArrayList<>();
    }

    public void setCarros(T carros) {
        this.carros.add(carros);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Carros:\n");
        for (T carro : carros) {
            sb.append(carro.toString()).append("\n");
        }
        return sb.toString();
    }

}
