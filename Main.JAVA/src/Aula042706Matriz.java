public class Aula042706Matriz {
    public static void main(String[] args) {

//        int [][] matriz = {
//                {1,2,3},  //Linha 1, indice 0
//                {4,5,6},  //Linha 2, indice 1
//                {7,8,9},  //Linha 3, indice 2
//                {0}
//        };


//
//        int numLinhas = matriz.length;
////        int numColuna = matriz[0].length;
//        System.out.println("Número de Linhas da Matriz: "+ numLinhas);
//
//        int numColunas=0;
//
//        //Econtrar o número máximo de colunas
//        for(int[] linha : matriz){
//            if(linha.length > numColunas){
//                numColunas = linha.length;
//                // System.out.println("colunas: "+ numColunas);
//            }
//        }




//
//        for (int i = 0; i < numLinha; i++) {
//            for (int j = 0; j < numColuna; j++) {
//                System.out.print(matriz[i][j] + " - ");
//            }
//            System.out.println(" 🌟 ");
//        }

//        for (int[] linha: matriz){
//            for(int elemento: linha){
//                System.out.print(elemento + " ");
//            }
//            System.out.println(" 🌟");
//        }
//
//
//        System.out.println(" ✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
//        System.out.println("Fim!");


        int [][][] matriz = {
                {
                        //linhas
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        //colunas
                        {10,11,12},
                        {13,14,15},
                        {16,17,18}
                },
                {
                        //profundidade
                        {19,20,21},
                        {22,23,24},
                        {25,26,27}
                }
        };

       //EXIBINDO A MATRIZ TRIDIMENSIONAL
//        System.out.println("Matriz Tridimensional Preenchida");
//        int pagina = 0;
//        for(int [][] paginaMatriz : matriz){
//            // System.out.println("Página " + (pagina + 1) + ":");
//            int linha = 0;
//            for(int[] linhaMatriz : paginaMatriz){
//                // System.out.println("Linha " + (linha+1)+ ":");
//                for(int valorColuna : linhaMatriz){
//                    System.out.print(valorColuna + "|");
//                }
//                System.out.println();
//                linha++;
//            }
//            pagina++;
//        }





    }
}
