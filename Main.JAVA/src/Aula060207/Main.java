package Aula060207;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bora Codar!");


        Prioridade status = Prioridade.ALTA;

        System.out.println(STR."Nível: \{status.getNivel()}");
        System.out.println(STR."Status: \{status}");

    }

}
