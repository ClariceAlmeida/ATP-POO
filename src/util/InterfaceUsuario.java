package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner sc = new Scanner(System.in);

    //metodos

    //Observações: Não criei nada sobre o desconto pois não foi descrito nas semanas anteriores

    // valor do imovel não pode ser 0, nem negativo nem menor que 2k
    public boolean validarValorImovel(double valorImovel) throws FinanciamentoException{
        if (valorImovel < 2000) {
            throw new FinanciamentoException("Valor do imóvel inválido.\nValor do imóvel precisa ser maior que R$2.000");
        }
        return true;
    }

    // pede valor do imovel
    public double cadastrarValorImovelValido(){
        double valorImovel = 0;
        boolean valorValido = false;
        do {
            try{
                System.out.println("Digite o valor do imóvel:");
                valorImovel = sc.nextDouble();
                valorValido = validarValorImovel(valorImovel);
            } catch (InputMismatchException e) {
                System.out.println("Número não reconhecido, tente novamente...");
                sc.next();
            } catch (FinanciamentoException e){
                System.out.println(e.getMessage());
            }
        } while (!valorValido);
        return valorImovel;
    }

    // prazo de Financiamento não pode ser 0, negativo ou passar de 30 anos
    public boolean validarPrazodeFinanciamento(int prazoFinanciamento) throws FinanciamentoException{
        if (prazoFinanciamento <= 0 || prazoFinanciamento > 30) {
            throw new FinanciamentoException("Prazo de financiamento inválido.\n" +
                    "Digite o prazo em anos, de 1 a 30.");
        }
        return true;
    }

    // pede prazo de financiamento em anos
    public int cadastrarPrazodeFinanciamentoValido() {
        int prazoFinanciamento = 0;
        boolean prazoValido = false;
        do {
            try {
                System.out.println("Digite o prazo do financiamento (em anos):");
                prazoFinanciamento = sc.nextInt();
                prazoValido = validarPrazodeFinanciamento(prazoFinanciamento);
            } catch (InputMismatchException e) {
                System.out.println("Número não reconhecido, tente novamente...");
                sc.next();
            } catch (FinanciamentoException e){
                System.out.println(e.getMessage());
            }
        } while (!prazoValido);
        return prazoFinanciamento;
    }

    // taxa de juros anual tem que ser entre 0 e 1000%
    public boolean validarTaxadeJuros(double taxaJuros) throws FinanciamentoException {
        if (taxaJuros <= 0 || taxaJuros > 1000) {
            throw new FinanciamentoException("Taxa de juros inválida");
        }
        return true;
    }

    // pede taxa de juros anual e valida
    public double cadastrarTaxadeJurosValida() {
        double taxaJuros = 0;
        boolean taxaValida = false;
        do {
            try {
                System.out.println("Digite a taxa de juros anual:");
                taxaJuros = sc.nextDouble();
                taxaValida = validarTaxadeJuros(taxaJuros);
            } catch (InputMismatchException e) {
                System.out.println("Número não reconhecido, tente novamente...");
                sc.next();
            } catch (FinanciamentoException e) {
                System.out.println(e.getMessage());
            }
        } while (!taxaValida);
        return taxaJuros;
    }

    // tamanho de área construida não pode ser negativa
    public boolean validarTamanhoAreaConstruida(double tamanhoAreaConstruida) throws FinanciamentoException {
        if (tamanhoAreaConstruida <= 0) {
            throw new FinanciamentoException("Tamanho da área construída inválida");
        }
        return true;
    }

    // cadastra tamanho da area construída
    public double cadastrarTamanhoAreaConstruida() {
        double tamanhoAreaConstruida = 0;
        boolean areaValida = false;
        do {
            try{
                System.out.println("Digite o tamanho da área construída:");
                tamanhoAreaConstruida = sc.nextDouble();
                areaValida = validarTamanhoAreaConstruida(tamanhoAreaConstruida);
            } catch (InputMismatchException e) {
                System.out.println("Número não reconhecido, tente novamente...");
                sc.next();
            } catch (FinanciamentoException e) {
                System.out.println(e.getMessage());
            }
        } while (!areaValida);
        return tamanhoAreaConstruida;
    }

    // tamanho do terreno não pode ser negativo nem igual a 0
    public boolean validarTamanhoTerreno(double tamanhoTerreno) throws FinanciamentoException{
        if (tamanhoTerreno <= 0) {
            throw new FinanciamentoException("Tamanho do terreno inválido");
        }
        return true;
    }

    // cadastra tamanho do terreno
    public double cadastrarTamanhoTerreno() {
        double tamanhoTerreno = 0;
        boolean tamanhoValido = false;
        do {
            try{
                System.out.println("Digite o tamanho do terreno:");
                tamanhoTerreno = sc.nextDouble();
                tamanhoValido = validarTamanhoTerreno(tamanhoTerreno);
            } catch (InputMismatchException e) {
            System.out.println("Número não reconhecido, tente novamente...");
            sc.next();
            } catch (FinanciamentoException e) {
                System.out.println(e.getMessage());
            }
        } while (!tamanhoValido);
        return tamanhoTerreno;
    }

    // numero não pode ser negativo
    public boolean validarNumerodeVagas(int numeroVagas) throws FinanciamentoException{
        if (numeroVagas < 0) {
            throw new FinanciamentoException("Número de vagas inválido");
        }
        return true;
    }

    // cadastra numero de vagas
    public int cadastrarNumerodeVagas() {
        int numeroVagas = 0;
        boolean numeroValido = false;
        do {
            try{
                System.out.println("Digite o número de vagas:");
                numeroVagas = sc.nextInt();
                numeroValido = validarNumerodeVagas(numeroVagas);
            } catch (InputMismatchException e) {
            System.out.println("Número não reconhecido, tente novamente...");
            sc.next();
            } catch (FinanciamentoException e) {
            System.out.println(e.getMessage());
            }
        } while (!numeroValido);
        return numeroVagas;
    }

    // numero não pode ser negativo nem maior que 163 (prédio mais alto do mundo)
    public boolean validarNumerodoAndar(int numeroAndar) throws FinanciamentoException{
        if (numeroAndar < 0 || numeroAndar > 163) {
            throw new FinanciamentoException("Número de andar inválido");
        }
        return true;
    }

    // cadastra numero do andar
    public int cadastrarNumerodoAndar() {
        int numeroAndar = 0;
        boolean numeroValido = false;
        do {
            try{
                System.out.println("Digite o número do andar:");
                numeroAndar = sc.nextInt();
                numeroValido = validarNumerodoAndar(numeroAndar);
            } catch (InputMismatchException e) {
                System.out.println("Número não reconhecido, tente novamente...");
                sc.next();
            } catch (FinanciamentoException e) {
                System.out.println(e.getMessage());
            }
        } while (!numeroValido);
        return numeroAndar;
    }
}