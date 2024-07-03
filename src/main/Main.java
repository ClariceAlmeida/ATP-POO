package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.FinanciamentoException;
import util.InterfaceUsuario;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FinanciamentoException, FileNotFoundException {

        // instanciei uma nova interface inteira para não tornar os metodos static
        InterfaceUsuario novaInterface = new InterfaceUsuario();

        // array para guardar os financiamentos
        ArrayList<Financiamento> financiamentosCadastrados = new ArrayList<>();


        //semana 5 - cadastro manual de imoveis
        financiamentosCadastrados.add(new Casa(novaInterface.cadastrarValorImovelValido(), novaInterface.cadastrarPrazodeFinanciamentoValido(), novaInterface.cadastrarTaxadeJurosValida(), novaInterface.cadastrarTamanhoAreaConstruida(), novaInterface.cadastrarTamanhoTerreno() ));
        financiamentosCadastrados.add(new Casa(500000, 10, 10, 200,300));
        financiamentosCadastrados.add(new Apartamento(500000,10,10, 2,8));
        financiamentosCadastrados.add(new Apartamento(100000,20,15,1,2));
        financiamentosCadastrados.add(new Terreno(500000, 10,10,"Residencial"));


        // seta as variaveis que serão utilizadas no for
        int i = 0;

        // abre um try para escrever em .txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Array-Financiamentos.txt"))) {
            // for para printar os 4 financiamentos
            for (Financiamento f : financiamentosCadastrados){

                // string que vai ser guardada
                String dadosFinanciamento = "- Financiamento " + (i+1) + " - \n" + f.mostrarDadosFinanciamento(f.calcularPagamentoMensal()) + "\n";

                writer.write(dadosFinanciamento);
                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // try para ler o arquivo .txt linha a linha
        try(BufferedReader reader = new BufferedReader(new FileReader("Array-Financiamentos.txt"))){
            String linha;
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try para salvar array serializado
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Array-Financiamentos.test"));
            outputStream.writeObject(financiamentosCadastrados);
        }catch (IOException e) {
            e.printStackTrace();
        }

        // try para ler arquivo com array desserializado
        try {
            ObjectInputStream inputStream = new ObjectInputStream((new FileInputStream("Array-Financiamentos.test")));
            Object obj = inputStream.readObject();
            if (obj instanceof ArrayList<?> verificarArray) {

                // verifica os elementos do array
                boolean verificaElementosdoArray = true;
                for (Object elemento : verificarArray) {
                    if (!(elemento instanceof Financiamento)) {
                        verificaElementosdoArray = false;
                        break;
                    }
                }
                // se for válido
                if (verificaElementosdoArray) {
                    ArrayList<Financiamento> financiamentosLidos = (ArrayList<Financiamento>) verificarArray;
                    // Exibir os financiamentos lidos
                    for (Financiamento f : financiamentosLidos) {
                        System.out.println(f.mostrarDadosFinanciamento(f.calcularPagamentoMensal()));
                    }
                } else {
                    System.out.println("O arquivo não contém uma lista de objetos Financiamento.");
                }
            } else {
                System.out.println("O arquivo não contém um ArrayList.");
            }

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }}


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


//        // printar os totais - não é mais utilizado na entrega - semana 8
//                  calculo dos totais
////                valorTotalImoveis += f.getValorImovel();
////                valorTotalFinanciamento += f.calcularPagamentoTotal(f.calcularPagamentoMensal());
//                  System.out.println("Total de todos os imóveis: R$" + String.format("%.2f", valorTotalImoveis) +
//                  ", valor total de todos os financiamentos: R$" + String.format("%.2f", valorTotalFinanciamento));