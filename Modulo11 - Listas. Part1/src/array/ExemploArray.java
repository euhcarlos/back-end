package array;

public class ExemploArray {

    public static void main(String args[]){
        declaracaoArray();
        tamanhoArray();
        percorendoArray();
        arrayBidimensional();
        novoArray();
    }

    private static void novoArray() {
        System.out.printf("**** NOVO ARRAY ****");
        String[] nomes = new String[4];
        nomes[0] = "Carlos";
        nomes[1] = "Eduardo";
        nomes[2] = "Ferreira";
        nomes[3] = "Araujo";

        for(String nome : nomes){
            System.out.printf(nome);
        }
    }

    private static void arrayBidimensional() {
        System.out.println("**** ARRAY BIDIMENSIONAL ****");
        int [][] array1 = {{1,2,3},{4,5,6}};
        int [][] array2 = {{1,2}, {3},{4,5,6}};

        System.out.println("Valores no array passados na linha são");
        outputArray(array1);
    }

    public static void outputArray(int[][] array){
        //LOOP PELAS LINHAS DO ARRAY
        for(int linha = 0; linha < array.length; linha++){
            //LOOP PELAS COLUNAS DO ARRAY
            for(int coluna = 0; coluna < array[linha].length; coluna++){
                System.out.printf("%d", array[linha][coluna]);
            }

        }
        System.out.printf("");
    }

    private static void percorendoArray() {
        System.out.println("**** PERCORENDO ARRAY ****");
        int[] arrayUm = {87,68,52,5,49,83,45};
        int total = 0;
        for(int i = 0; i < arrayUm.length; i++){
            System.out.println(arrayUm[i]);
        }

        System.out.println("**** PERCORENDO ARRAY 2****");
        int[] arrayDois = {87,68,52,5,49,83,45};
        for(int i = 0; i < arrayDois.length; i++){
            System.out.println(arrayDois[i]);
        }
    }

    private static void tamanhoArray() {
        System.out.println("**** TAMANHO ARRAY ****");
        int[] arrayUm = {12,3,5,68,9,6,73};
        int[] arrayDois = {43,42,4,8,55,20};

        if(arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
        System.out.println("");
    }

    private static void declaracaoArray() {
        System.out.println("**** DECLARANDO ARRAY ****");

        //[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];

        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];

        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

        //{} - INCIALIZAR VALORES EM UM ARRAY
        int[] inciaValores = {12,40,54,6,85,47,41,20};

        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;

        //ALOCAR MEMORIA PARA 10 INTEIROS
        meuArray = new int[10];

        //COLOCANDO ITEM EM CADA POSIÇÃO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
        System.out.println("");
    }
}
