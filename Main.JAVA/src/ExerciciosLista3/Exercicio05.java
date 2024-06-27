package ExerciciosLista3;

/*5. Média de Valores Únicos:
Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média. */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Exercicio05 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(9);
        lista.add(1);
        lista.add(7);
        lista.add(3);
        lista.add(9);
        lista.add(4);
        lista.add(6);

        double media = calcularMediaUnicos(lista);

        System.out.println("Lista Original : " + lista);
        System.out.println("Lista sem Duplicatas " + removerDuplicados(lista));
        System.out.println("Média dos valores únicos: " + media);

    }

    public static <Integer> List<Integer> removerDuplicados(List<Integer> lista) {
        Set<Integer> conjunto = new HashSet<>();
        List<Integer> listaSemDuplicados = new ArrayList<>();

        for (Integer elemento : lista) {

            if (conjunto.add(elemento)) {
                listaSemDuplicados.add(elemento);
            }

        }

        return listaSemDuplicados;
    }



    public static double calcularMediaUnicos(List<Integer> lista) {
        List<Integer> unicos = new ArrayList<>();
        for (Integer elemento : lista) {
            if (!unicos.contains(elemento)) {
                unicos.add(elemento);
            }
        }

        if (unicos.isEmpty()) {
            return 0;
        }

        int soma = 0;
        for (Integer numero : unicos) {
            soma += numero;
        }

        return (double) soma / unicos.size();
    }

}