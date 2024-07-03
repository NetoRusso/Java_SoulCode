package Aula060207.ExerciciosLista05.Exercicio05;

public class LojaMain {
    public static void main(String[] args) {

        Produto maquinaLavaESeca = new Eletronicos("Lava e seca marca Media", 3299.90, 10, TipoProduto.ELETRONICOS);
        Produto blusa = new Roupas("Blusa Balanciaga", 1787.85, 12, TipoProduto.ROUPAS);
        Produto energetico = new Alimentos("Energético Monster Original", 7.75, 300, TipoProduto.ALIMETOS);


        maquinaLavaESeca.detalheProduto();
        blusa.detalheProduto();
        energetico.detalheProduto();

        maquinaLavaESeca.calcularFrete();
        blusa.calcularFrete();
        energetico.calcularFrete();

        maquinaLavaESeca.aplicarDesconto(10);
        blusa.aplicarDesconto(10);
        energetico.aplicarDesconto(10);

        maquinaLavaESeca.vender();
        blusa.vender();
        energetico.vender();

        maquinaLavaESeca.controlarEstoque();
        blusa.controlarEstoque();
        energetico.controlarEstoque();


    }
}
