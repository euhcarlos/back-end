package builder;

public class Gerente {

    BurgerBuilder builder;

    public Gerente(BurgerBuilder builder){
        this.builder = builder;
    }

    public Burger buildBurger(){
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalada();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
