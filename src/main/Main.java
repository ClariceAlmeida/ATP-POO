package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {

        // instanciei uma nova interface inteira para não tornar os metodos static
        InterfaceUsuario novaInterface = new InterfaceUsuario();

        // trazer dados válidos
        double valorImovel = novaInterface.cadastrarValorImovelValido();
        int prazoFinanciamento = novaInterface.cadastrarPrazodeFinanciamentoValido();
        double taxaJurosAnual = novaInterface.cadastrarTaxadeJurosValida();

        // cria um novo financiamento com os dados inseridos (após validação bem-sucedida)
        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        System.out.println("Financiamento Cadastrado!");
        System.out.println(novoFinanciamento.mostrarDadosFinanciamento(novoFinanciamento.calcularPagamentoMensal()));
    }
}