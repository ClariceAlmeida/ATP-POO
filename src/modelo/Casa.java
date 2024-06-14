package modelo;

public class Casa extends Financiamento{


    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal(){
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + ((taxaJurosAnual/100)/12)) + 80;
    }
}
