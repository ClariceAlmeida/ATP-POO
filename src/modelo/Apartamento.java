package modelo;

public class Apartamento extends Financiamento{


    private int numeroDeVagas;
    private int numeroDoAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroDeVagas, int numeroDoAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroDeVagas = numeroDeVagas;
        this.numeroDoAndar = numeroDoAndar;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public int getNumeroDoAndar() {
        return numeroDoAndar;
    }

    public double calcularPagamentoMensal(){
        double taxaMensal = (taxaJurosAnual/100)/12;
        int meses = prazoFinanciamento * 12;
        return valorImovel * taxaMensal / (1 - Math.pow((1 + taxaMensal), -meses));
    }

    @Override
    public String mostrarDadosFinanciamento(double pagamentoMensal) {
        return String.format(
                "Valor Imóvel: R$%.2f%n" +
                        "Prazo de financiamento (em anos): %d%n" +
                        "Taxa de juros anual: %.2f%%%n" +
                        "Número de vagas: %d%n" +
                        "Número do andar: %d%n" +
                        "Valor total do financiamento: R$%.2f%n" +
                        "Valor das parcelas: R$%.2f%n",
                getValorImovel(),
                getPrazoFinanciamento(),
                getTaxaJurosAnual(),
                getNumeroDeVagas(),
                getNumeroDoAndar(),
                calcularPagamentoTotal(pagamentoMensal),
                calcularPagamentoMensal()
        );
    }

}
