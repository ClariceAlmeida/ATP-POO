package modelo;

public class Terreno extends Financiamento{

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }
    public double calcularPagamentoMensal(){
        double pagamenoMensal = valorImovel / (prazoFinanciamento * 12) * (1 + ((taxaJurosAnual/100)/12));
        return pagamenoMensal + pagamenoMensal * (2.0 / 100);
    }
}
