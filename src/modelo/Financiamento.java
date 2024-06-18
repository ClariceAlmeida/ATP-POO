package modelo;

public abstract class Financiamento {

    // atributos
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

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
    // calcula pagamento mensal - implementação diferente para todas as classes - método abstrato
    public abstract double calcularPagamentoMensal();

    // calcula pagamento total - comum a todos as subclasses
    public double calcularPagamentoTotal(double pagamentoMensal){
        return pagamentoMensal * prazoFinanciamento * 12;
    }

    // mostra dados do financiamento - implementeção diferente para as subclasses - método abstrato
    public abstract String mostrarDadosFinanciamento(double pagamentoMensal);
}
