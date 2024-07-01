package Aula050107;

public class Carro {
    Double velocidade;
    String modelo, cor;

    //Construtor padrao
    public Carro(){
        this.modelo = "Desconhecido";
        this.cor = "Desconhecida";
        this.velocidade = 0.0;
    }
    //Construtor com argumento
    public Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0.0;
    }
    //Métodos
    public void acelerar(Double tempo, Double valor){
        velocidade += (tempo * valor);
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
    }
    public void frear(){
        velocidade = (velocidade>= 10.0) ? velocidade - 10.0 : 0.0;
        System.out.println("O carro freou. Velocidade atual: " + velocidade + " km/h");
    }
    public void acenderFarol(){
        System.out.println("Os faróis foram acesos.");
    }
    public void trocarMarcha(){
        System.out.println("A marcha foi trocada.");
    }

}
