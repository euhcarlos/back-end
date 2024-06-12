package forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploForPPT2 {

    public static void main(String args[]){
        List<Integer> valores = new ArrayList<>();

        System.out.println("For comum");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            valores.add(i);
        }

        System.out.println("For em lista");
        for (Integer i : valores){
            System.out.println(i);
        }

        System.out.println("Forma nova de for");
        valores.forEach(i -> System.out.println("Linha: " + i));
    }
}
