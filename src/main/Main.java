package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // instanciei uma nova interface inteira para não tornar os metodos static
        InterfaceUsuario novaInterface = new InterfaceUsuario();

        // array para guardar os financiamentos
        ArrayList<Financiamento> financiamentosCadastrados = new ArrayList<>();

        // do-while para cadastrar 4 financiamentos
        do {
            // trazer dados válidos
            double valorImovel = novaInterface.cadastrarValorImovelValido();
            int prazoFinanciamento = novaInterface.cadastrarPrazodeFinanciamentoValido();
            double taxaJurosAnual = novaInterface.cadastrarTaxadeJurosValida();

            // cria um novo financiamento com os dados inseridos (após validação bem-sucedida)
            Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentosCadastrados.add(novoFinanciamento);
            System.out.println("Financiamento Cadastrado!");
        } while (financiamentosCadastrados.size() < 4);

        // seta as variaveis que serão utilizadas no for
        int i = 0;
        double valorTotalImoveis = 0;
        double valorTotalFinanciamento = 0;

        // for para printar os 4 financiamentos
        for (Financiamento f : financiamentosCadastrados){

            // calculo dos totais
            valorTotalImoveis += f.getValorImovel();
            valorTotalFinanciamento += f.calcularPagamentoTotal(f.calcularPagamentoMensal());

            System.out.println("- Financiamento " + (i+1) + " -- " +
                    "Valor do imóvel: R$" + String.format("%.2f", f.getValorImovel()) + "," +
                    " Valor financiamento: R$" + String.format("%.2f", f.calcularPagamentoTotal(f.calcularPagamentoMensal())));
            i++;

        }

        // printar os totais
        System.out.println("Total de todos os imóveis: R$" + String.format("%.2f", valorTotalImoveis) +
                ", valor total de todos os financiamentos: R$" + String.format("%.2f", valorTotalFinanciamento));

    }
}