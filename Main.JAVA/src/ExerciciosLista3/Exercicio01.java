package ExerciciosLista3;

/*1. Soma dos Elementos Pares:
Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros. */

import java.util.List;

public class Exercicio01 {

    public static void main(String[] args) {

        List <Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = 0;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 2 == 0) {
                soma += lista.get(i);
            }
        }

        System.out.println("Lista Original: " + lista + " - Soma dos Elementos Pares: " + soma);

    }
}
