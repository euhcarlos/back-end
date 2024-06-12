package ReferenciaMetodos;

public class TesteReferenciaMetodos {

    public static void main(String[] args) {
        //Referencia de metodos estaticos
        Finder finder = MyClass::doFind;
        int result = finder.find("Teste", "Teste");
        System.out.println(result);
    }
}
