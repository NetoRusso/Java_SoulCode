package Aula060207.Interfaces;

public class Cavalo implements Animal {
    @Override

    public void fazerSom() {
        System.out.println("O cavalo está fazendo som");
    }

    @Override
    public void comer() {
        System.out.println("O cavalo está comendo");
    }

}
