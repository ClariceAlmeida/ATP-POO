package modelo;

public class Apartamento extends Financiamento{

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal(){
        double taxaMensal = (taxaJurosAnual/100)/12;
        int meses = prazoFinanciamento * 12;
        return valorImovel * taxaMensal / (1 - Math.pow((1 + taxaMensal), -meses));
    }

}
