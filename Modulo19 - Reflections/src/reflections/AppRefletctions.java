package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppRefletctions {

    public static void main(String[] args) throws NoSuchMethodException {
        Class clas = Produto.class;
        System.out.println(clas);

        Produto prod = new Produto();
        Class clas1 = prod.getClass();
        System.out.println(clas1);

        try{
            Constructor cons = clas.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            //FIELD: Variavel dentro da classe
            Field[] fields = prod1.getClass().getDeclaredFields();
            for(Field field : fields){
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

            //METHOD: Metodos dentro de uma classe
            Method[] method = prod1.getClass().getDeclaredMethods();
            for(Method m : method){
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);

                System.out.println("Executando metodos");
                if(m.getName().startsWith("get")){
                    System.out.println(m.invoke(prod1));
                } else {
                    for(Class classesTypes : m.getParameterTypes()){
                        if(classesTypes.equals(String.class)){
                            System.out.println(m.invoke(prod1, "Carlos"));
                        } else if (classesTypes.equals(Long.class)) {
                            System.out.println(m.invoke(prod1, 10l));
                        } else if(classesTypes.equals(Double.class)){
                            System.out.println(m.invoke(prod1, 5d));
                        }
                    }
                }
            }


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
