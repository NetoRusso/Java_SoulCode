import java.util.Arrays;

public class Aula03D2606 {
    public static void main(String[] args) {
//        Arrays em Java
//        Unidimensionais: VETOR

        int [] a;
        int [] b = new int[10];
        int [] c = {1,2,3,4,5,6};
        String [] nomes = {"Douglas", "Dennys"};

/*
        System.out.println(nomes[1]);
        nomes[0] = "Luciana";

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome: " + nomes[i] + " esta na posição " + i);
        }

        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.toString(c));

        for (int elemento : c) {
            System.out.println(elemento);
        }

        for (int elemento : b) {
            System.out.println(elemento);
        }

        for (String elemento : nomes) {
            System.out.println(elemento);
        }

        for (int elemento : c) {
            elemento = elemento * 2;
            System.out.println(elemento);
        }

        int soma = 0;

        for (int i = 0; i < c.length; i++) {
            soma +=  c[i];
        }

        double media = (double) soma / c.length;
        System.out.println("A média da lista c é " + media);
*/

//        Adicionar novo elemento ao c[]

        int novoElemento = 7;
        int novoTamanho = c.length + 1;
        c = Arrays.copyOf(c, novoTamanho);
        c[novoTamanho - 1] = novoElemento;
        System.out.println(Arrays.toString(c));



//        Remover elemento do c[]

        int elementoARemover = 3;
        int novoTamanho2 = c.length - 1;


        boolean elementoEncontrado = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == elementoARemover) {
                elementoEncontrado = true;
                break;
            }
        }

        if (elementoEncontrado) {
            int[] cNovo = new int[novoTamanho2];
            int j = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != elementoARemover) {
                    cNovo[j] = c[i];
                    j++;
                }
            }
            c = cNovo;
        }

        System.out.println(Arrays.toString(c));


    }
}
