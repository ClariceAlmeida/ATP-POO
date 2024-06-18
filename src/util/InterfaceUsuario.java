package util;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner sc = new Scanner(System.in);

    //metodos

    // valor do imovel não pode ser 0, nem negativo nem menor que 2k
    public boolean validarValorImovel(double valorImovel) {
        if (valorImovel < 2000) {
            System.out.println("Valor do imóvel inválido.\nValor do imóvel precisa ser maior que R$2.000");
            return false;
        }
        return true;
    }

    // pede valor do imovel
    public double cadastrarValorImovelValido() {
        double valorImovel;
        do {
            System.out.println("Digite o valor do imóvel:");
            valorImovel = sc.nextDouble();
        } while (!validarValorImovel(valorImovel));
        return valorImovel;
    }

    // prazo de Financiamento não pode ser 0, negativo ou passar de 30 anos
    public boolean validarPrazodeFinanciamento(int prazoFinanciamento) {
        if (prazoFinanciamento <= 0 || prazoFinanciamento > 30) {
            System.out.println("Prazo de financiamento inválido.\n" +
                    "Digite o prazo em anos, de 1 a 30.");
            return false;
        }
        return true;
    }

    // pede prazo de financiamento em anos
    public int cadastrarPrazodeFinanciamentoValido() {
        int prazoFinanciamento;
        do {
            System.out.println("Digite o prazo do financiamento (em anos):");
            prazoFinanciamento = sc.nextInt();
        } while (!validarPrazodeFinanciamento(prazoFinanciamento));
        return prazoFinanciamento;
    }

    // taxa de juros anual tem que ser entre 0 e 1000%
    public boolean validarTaxadeJuros(double taxaJuros) {
        if (taxaJuros <= 0 || taxaJuros > 1000) {
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

    // tamanho de área construida não pode ser negativa
    public boolean validarTamanhoAreaConstruida(double tamanhoAreaConstruida) {
        if (tamanhoAreaConstruida <= 0) {
            System.out.println("Tamanho da área construída inválida");
            return false;
        }
        return true;
    }

    // cadastra tamanho da area construída
    public double cadastrarTamanhoAreaConstruida() {
        double tamanhoAreaConstruida;
        do {
            System.out.println("Digite o tamanho da área construída:");
            tamanhoAreaConstruida = sc.nextDouble();
        } while (!validarTamanhoAreaConstruida(tamanhoAreaConstruida));
        return tamanhoAreaConstruida;
    }

    // tamanho do terreno não pode ser negativo nem igual a 0
    public boolean validarTamanhoTerreno(double tamanhoTerreno) {
        if (tamanhoTerreno <= 0) {
            System.out.println("Tamanho do terreno inválido");
            return false;
        }
        return true;
    }

    // cadastra tamanho do terreno
    public double cadastrarTamanhoTerreno() {
        double tamanhoTerreno;
        do {
            System.out.println("Digite o tamanho do terreno:");
            tamanhoTerreno = sc.nextDouble();
        } while (!validarTamanhoTerreno(tamanhoTerreno));
        return tamanhoTerreno;
    }

    // numero não pode ser negativo
    public boolean validarNumerodeVagas(int numeroVagas) {
        if (numeroVagas < 0) {
            System.out.println("Nnúmero de vagas inválido");
            return false;
        }
        return true;
    }

    // cadastra numero de vagas
    public int cadastrarNumerodeVagas() {
        int numeroVagas;
        do {
            System.out.println("Digite o número de vagas:");
            numeroVagas = sc.nextInt();
        } while (!validarNumerodeVagas(numeroVagas));
        return numeroVagas;
    }

    // numero não pode ser negativo nem maior que 163 (prédio mais alto do mundo)
    public boolean validarNumerodoAndar(int numeroAndar) {
        if (numeroAndar < 0 || numeroAndar > 163) {
            System.out.println("Nnúmero de andar inválido");
            return false;
        }
        return true;
    }

    // cadastra numero do andar
    public int cadastrarNumerodoAndar() {
        int numeroAndar;
        do {
            System.out.println("Digite o número do andar:");
            numeroAndar = sc.nextInt();
        } while (!validarNumerodoAndar(numeroAndar));
        return numeroAndar;
    }

}