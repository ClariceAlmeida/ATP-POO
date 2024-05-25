package modelo;

public class Financiamento {

    // atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //getters
    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    // metodos
    // calcula pagamento mensal
    public double calcularPagamentoMensal(){
        return(valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual/12));
    }

    // calcula pagamento total
    public double calcularPagamentoTotal(double pagamentoMensal){
        return pagamentoMensal * prazoFinanciamento * 12;
    }

    // mostra dados do financiamento
    public String mostrarDadosFinanciamento(double pagamentoMensal){
        return "Valor Imóvel: " + "R$" + getValorImovel() + "\n" + "Prazo de financiamento (em anos): " + getPrazoFinanciamento() + "\n" + "Taxa de juros anual: " + getTaxaJurosAnual() + "%" + "\n" +
                "Valor total do financiamento: " + "R$" + calcularPagamentoTotal(pagamentoMensal) + "\n" + "Valor das parcelas: " + "R$" + calcularPagamentoMensal() + "\n";
    }
}
