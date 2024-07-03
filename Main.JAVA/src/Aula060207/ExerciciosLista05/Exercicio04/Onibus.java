package Aula060207.ExerciciosLista05.Exercicio04;

import java.text.DecimalFormat;

public class Onibus extends Transporte {

    public Onibus(int assentos,  double tarifa, TipoTransporte tipo) {
        super(assentos, tarifa, tipo);
    }

    @Override
    public void calcularTarifa(int quantidade) {
        DecimalFormat formato = new DecimalFormat("0.00");
        if(quantidade <= 0){
            System.out.println("Quantidade inválida!");
        }else {
            System.out.println("Tarifa do Onibus: R$" + formato.format(getTarifa() * quantidade));
        }
    }





}
