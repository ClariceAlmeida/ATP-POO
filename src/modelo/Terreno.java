package modelo;

public class Terreno extends Financiamento{

    private String tipoDeZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoDeZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoDeZona = tipoDeZona;
    }

    public String getTipoDeZona() {
        return tipoDeZona;
    }

    public double calcularPagamentoMensal(){
        double pagamenoMensal = valorImovel / (prazoFinanciamento * 12) * (1 + ((taxaJurosAnual/100)/12));
        return pagamenoMensal + pagamenoMensal * (2.0 / 100);
    }

    @Override
    public String mostrarDadosFinanciamento(double pagamentoMensal) {
        return String.format(
                        "Valor Imóvel: R$%.2f%n" +
                        "Prazo de financiamento (em anos): %d%n" +
                        "Taxa de juros anual: %.2f%%%n" +
                        "Tipo de zona: " + getTipoDeZona() + "\n" +
                        "Valor total do financiamento: R$%.2f%n" +
                        "Valor das parcelas: R$%.2f%n",
                getValorImovel(),
                getPrazoFinanciamento(),
                getTaxaJurosAnual(),
                calcularPagamentoTotal(pagamentoMensal),
                calcularPagamentoMensal()
        );
    }
}
