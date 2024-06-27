package ExerciciosLista3;

/*4. Remoção de Elementos Duplicados:
Escreva um método que remova todos os elementos duplicados de uma lista, mantendo apenas a primeira ocorrência de cada elemento. */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio04 {

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

        System.out.println("Lista Original: " + lista);
        List<Integer> listaSemDuplicados = removerDuplicados(lista);

        System.out.println("Lista sem Duplicados: " + bubbleCrescente(listaSemDuplicados));
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

    public static List<Integer> bubbleCrescente(List<Integer> numeros) {
        //Bubble Sort
        for (int i = 0; i < numeros.size(); i++) {

            for (int j = 0; j < numeros.size(); j++) {

                if (numeros.get(i) < numeros.get(j)) {

                    int temp = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp);
                }
            }
        }

        return numeros;
    }
}
