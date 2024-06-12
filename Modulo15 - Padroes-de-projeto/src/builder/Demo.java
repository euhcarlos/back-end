package builder;

public class Demo {

    public static void main(String[] args) {
       Gerente gerente = new Gerente(new CheeseBurgerBuilder());
       Burger burger = gerente.buildBurger();
       burger.print();
    }
}
