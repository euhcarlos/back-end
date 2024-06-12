public class Casting {

    public static void main(String args[]){
        int num1 = 10;
        System.out.println(num1);
        //Casting Explicito - As vezes pode não funcionar direito.
        short num2 = (short) num1;
        System.out.println(num2);

        //Casting Implicito
        int idade = 10;
        long idadeL = idade;

        byte s = 1;
        short s2 = s;
    }
}
