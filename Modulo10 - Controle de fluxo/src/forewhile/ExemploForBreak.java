package forewhile;

public class ExemploForBreak {

    public static void main(String args[]){
        for (int contador = 1; contador <= 1000; contador++){
            System.out.println("Está em nr:" + contador);
            if(contador==10){
                break;
            }
        }
    }
}
