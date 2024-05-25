package util;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner sc = new Scanner(System.in);

    //metodos

    // valor do imovel não pode ser 0, nem negativo nem menor que 2k
    public boolean validarValorImovel(double valorImovel){
        if(valorImovel < 2000){
            System.out.println("Valor do imóvel inválido.\n Valor do imóvel precisa ser maior que R$2.000");
            return false;
        }
        return true;
    }

    // pede valor do imovel
    public double cadastrarValorImovelValido(){
        double valorImovel;
        do{
            System.out.println("Digite o valor do imóvel:");
            valorImovel = sc.nextDouble();
        }while(!validarValorImovel(valorImovel));
        return valorImovel;
    }

    // prazo de Financiamento não pode ser 0, negativo ou passar de 30 anos
    public boolean validarPrazodeFinanciamento(int prazoFinanciamento){
        if (prazoFinanciamento <= 0 || prazoFinanciamento > 30){
            System.out.println("Prazo de financiamento inválido.\n" +
                    "Digite o prazo em anos, de 1 a 30.");
            return false;
        }
        return true;
    }

    // pede prazo de financiamento em anos
    public int cadastrarPrazodeFinanciamentoValido(){
        int prazoFinanciamento;
        do{
            System.out.println("Digite o prazo do financiamento (em anos):");
            prazoFinanciamento = sc.nextInt();
        } while(!validarPrazodeFinanciamento(prazoFinanciamento));
        return prazoFinanciamento;
    }

    // taxa de juros anual tem que ser entre 0 e 1000%
    public boolean validarTaxadeJuros(double taxaJuros){
        if (taxaJuros <= 0 || taxaJuros > 1000){
            System.out.println("Taxa de juros inválida");
            return false;
        }
        return true;
    }

    // pede taxa de juros anual e valida
    public double cadastrarTaxadeJurosValida() {
        double taxaJuros;
        do {
            System.out.println("Digite a taxa de juros anual:");
            taxaJuros = sc.nextDouble();
        } while (!validarTaxadeJuros(taxaJuros));
        return taxaJuros;
    }

}
