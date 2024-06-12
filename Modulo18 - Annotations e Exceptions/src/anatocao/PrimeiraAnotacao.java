package anatocao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface PrimeiraAnotacao {

    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 10d;
}
