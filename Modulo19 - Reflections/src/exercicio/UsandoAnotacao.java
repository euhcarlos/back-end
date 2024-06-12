package exercicio;

import java.lang.reflect.Method;

@Tabela(nomeTabela = "Tabela Carlos")
public class UsandoAnotacao {

    public static void main(String[] args) {
        UsandoAnotacao usandoAnotacao = new UsandoAnotacao();
        usandoAnotacao.lendoAnotacao();
    }

    private void lendoAnotacao() {
        try{
            Class<?> clazz = this.getClass();

            if(clazz.isAnnotationPresent(Tabela.class)){
                Tabela anotacao = clazz.getAnnotation(Tabela.class);
                System.out.println("Nome da tabela: " + anotacao.nomeTabela());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
