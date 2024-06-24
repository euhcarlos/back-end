package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Pessoa> listaDePessoas = new ArrayList<>();

        System.out.println("Deseja adicionar nomes, (S/N): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("S")){

            System.out.println("Digite os dados no formato 'nome,sexo' e digite para terminar:");
            String dado = s.next();

            String[] parts = dado.split(",");

            Pessoa pessoas = new Pessoa(parts[0], parts[1]);
            listaDePessoas.add(pessoas);

            System.out.println("Deseja adicionar nomes, (S/N): ");
            resposta = s.next();
        }

        List<Pessoa> listaMulheres = filtraMulheres(listaDePessoas);

        listaMulheres.stream().forEach(System.out::println);
    }

    public static List<Pessoa> filtraMulheres(List<Pessoa> pessoa){
        return pessoa.stream()
                .filter(e -> e.getNome().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }
}
