package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.FinanciamentoException;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FinanciamentoException {

        // instanciei uma nova interface inteira para não tornar os metodos static
        InterfaceUsuario novaInterface = new InterfaceUsuario();

        // array para guardar os financiamentos
        ArrayList<Financiamento> financiamentosCadastrados = new ArrayList<>();


        //semana 5 - cadastro manual de imoveis
        var casa1 = new Casa(novaInterface.cadastrarValorImovelValido(), novaInterface.cadastrarPrazodeFinanciamentoValido(), novaInterface.cadastrarTaxadeJurosValida(), novaInterface.cadastrarTamanhoAreaConstruida(), novaInterface.cadastrarTamanhoTerreno() );
        financiamentosCadastrados.add(casa1);
        var casa2 = new Casa(500000, 10, 10, 200,300);
        financiamentosCadastrados.add(casa2);
        var apartamento1 = new Apartamento(500000,10,10, 2,8);
        financiamentosCadastrados.add(apartamento1);
        var apartamento2 = new Apartamento(100000,20,15,1,2);
        financiamentosCadastrados.add(apartamento2);
        var terreno = new Terreno(500000, 10,10,"Residencial");
        financiamentosCadastrados.add(terreno);


        // seta as variaveis que serão utilizadas no for
        int i = 0;
        double valorTotalImoveis = 0;
        double valorTotalFinanciamento = 0;

        // for para printar os 4 financiamentos
        for (Financiamento f : financiamentosCadastrados){

            // calculo dos totais
            valorTotalImoveis += f.getValorImovel();
            valorTotalFinanciamento += f.calcularPagamentoTotal(f.calcularPagamentoMensal());

            System.out.println("- Financiamento " + (i+1) + " - \n" + f.mostrarDadosFinanciamento(f.calcularPagamentoMensal()) + "\n");
            i++;

        }

        // printar os totais
        System.out.println("Total de todos os imóveis: R$" + String.format("%.2f", valorTotalImoveis) +
                ", valor total de todos os financiamentos: R$" + String.format("%.2f", valorTotalFinanciamento));

    }
}


//        // do-while para cadastrar 4 financiamentos - semana 4
//        do {
//            // trazer dados válidos
//            double valorImovel = novaInterface.cadastrarValorImovelValido();
//            int prazoFinanciamento = novaInterface.cadastrarPrazodeFinanciamentoValido();
//            double taxaJurosAnual = novaInterface.cadastrarTaxadeJurosValida();
//
//            // cria um novo financiamento com os dados inseridos (após validação bem-sucedida)
//            Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
//            financiamentosCadastrados.add(novoFinanciamento);
//            System.out.println("Financiamento Cadastrado!");
//        } while (financiamentosCadastrados.size() < 4);