package exercicios.part1;

public abstract class Carro {

    private Integer potencia;
    private String tanque;
    private String cor;

    public Carro(String cor, String tanque, Integer portencia) {
        this.cor = cor;
        this.tanque = tanque;
        this.potencia = portencia;
    }

    public void andar(){
        System.out.println("Tudo pronto para andar com seu carro: " + "Cavalos: " + potencia  + " - " + "Gasolina: " + tanque + " - " + "Cor: " + cor);
    }
    public void limpar(){
        System.out.println("Limpando carro");
    }

    public void mecanica(){
        System.out.println("Mecanica: OKAY");
    }
}
