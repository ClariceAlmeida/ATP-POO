package modelo;

public class Casa extends Financiamento{


    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public double getTamanhoAreaConstruida() {
        return tamanhoAreaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }


    public double calcularPagamentoMensal(){
        return (valorImovel / (prazoFinanciamento * 12)) * (1 + ((taxaJurosAnual/100)/12)) + 80;
    }

    @Override
    public String mostrarDadosFinanciamento(double pagamentoMensal) {
        return String.format(
                "Valor Imóvel: R$%.2f%n" +
                        "Prazo de financiamento (em anos): %d%n" +
                        "Taxa de juros anual: %.2f%%%n" +
                        "Tamanho da área construída: %.2f%n" +
                        "Tamanho do terreno: %.2f%n" +
                        "Valor total do financiamento: R$%.2f%n" +
                        "Valor das parcelas: R$%.2f%n",
                getValorImovel(),
                getPrazoFinanciamento(),
                getTaxaJurosAnual(),
                getTamanhoAreaConstruida(),
                getTamanhoTerreno(),
                calcularPagamentoTotal(pagamentoMensal),
                calcularPagamentoMensal()
        );
    }
}
