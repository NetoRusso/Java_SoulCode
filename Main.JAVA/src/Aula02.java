import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aula02 {



    public static void main(String[] args) {
//        Laços de repetição
        /* ESTRUTURAS DE REPETIÇÃO
         * for Loop
         * While Loop
         * Do-While Loop
         * Enhanced For Loop (For-Each Loop)
         */

        // for (int i = 0; i <= 5; i++){
        //     System.out.println("O Valor de i: " + i);
        // }

        // int i;
        // for (i= 0; i <= 5; i++){
        //     System.out.println("O Valor de i: " + i);
        // }

        // for (int i= 0; i <= 5;){
        //     System.out.println("O Valor de i: " + i);
        //     i++;
        // }

        // int i;
        // for (i= 0; i <= 5;){
        //     System.out.println("O Valor de i: " + i);
        //     i++;
        // }

        // for (int i = 0; i <= 5; System.out.println("O Valor de i: " + i), i++);

        // for (int i = 0, j = 0; i<= 5; i++, j=i){
        //     System.out.println("O valor de i: " +  j);
        // }

        // for (int i = 0; i <= 5; i=increment(i)){
        //     System.out.println("O valor de i: " + i);
        //     }
        // }
        // public static int increment(int i){
        //     return ++i;
        // }



//        For mais modernos

//        IntStream.rangeClosed(0, 5).forEach(i -> System.out.println("O valor atual de i é: " + i ));

        //Gerar uma lista de inteiros de 0 a 5 usando IntStream
//        List<Integer> numeros = IntStream.rangeClosed(0, 5).boxed().collect(Collectors.toList());

        //Iterando sobre a lista e imprimindo valores
//        numeros.forEach(j -> System.out.println("O valor de j: " + j));

//        while===========

        int i = 0;
//        while (i < 5) {
//            System.out.println("O valor de i: " + i);
//            i++;
//        }

//        do while===========

//        do {
//            System.out.println("O valor de i: " + i);
//            i++;
//        } while (i <= 5);






    }
}
