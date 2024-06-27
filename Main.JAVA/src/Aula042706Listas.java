import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aula042706Listas {
    public static void main(String[] args) {
        //LISTAS

        //ARRAY LIST

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Anajada");
        alunos.add("Pedro");
        alunos.add(0, "Sebastião");
        alunos.add( "Lucas");

        System.out.println("Alunos: " + alunos);

        alunos.remove(0);
        System.out.println(alunos);

        //Adicionando varios alunos addAll()
        List<String> novosAlunos = Arrays.asList("Thiago", "Luciana", "Douglas");
        alunos.addAll(novosAlunos);
        System.out.println("Alunos: " + alunos);

//        Iprimir os indices e os elementos da lista

        System.out.println("Índices e elementos da lista");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Índice: " + i + " - Elemento: " + alunos.get(i));
        }

        //LISTAS ORDENADAS

        Collections.sort(alunos);


    }
}
