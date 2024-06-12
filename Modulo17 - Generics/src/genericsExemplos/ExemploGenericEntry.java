package genericsExemplos;

public class ExemploGenericEntry {
    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("Teste", 10L);
        System.out.println(entry.getData());

        GenericEntry<Long, String> entryLong = new GenericEntry<Long, String>(10l, "Carlos");
        System.out.println(entryLong.getData());
    }
}
