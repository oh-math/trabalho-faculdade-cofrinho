package main.java.br.com.cofrinho;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Real real = new Real();
        Dolar dolar = new Dolar();
        Euro euro = new Euro();

        // Interruptor para "ligar" e "desligar" o programa do Cofrinho
        boolean interruptor = true;

        cofrinho.adicionar(real);
        cofrinho.adicionar(dolar);
        cofrinho.adicionar(euro);

        Scanner scanner = new Scanner(System.in);

        // Loop while para repetir instruções até que o usuário decida interroper o
        // programa definindo "interruptor" como false quando escolher a opção "0"
        while (interruptor) {
            System.out.println(
                    "---------------------------------------------------------"
                            +
                            "\nPrograma 'Cofrinho' criado por Matheus da Costa "
                            + "\nCOFRINHO: \n1 - Adicionar Moeda \n2 - Remover Moeda \n3 - Listar Moedas \n4 - Valor total convertido para real \n0 - Encerrar");

            Integer primeiroPassso = scanner.nextInt();

            if (primeiroPassso == 1) {
                System.out.println(
                        "Escolha a moeda: \n1 - Real \n2 - Dólar \n3 - Euro \n");
                Integer moedas = scanner.nextInt();

                switch (moedas) {
                    case 1:
                        addMoeda(scanner, cofrinho, real);
                        break;

                    case 2:
                        addMoeda(scanner, cofrinho, dolar);
                        break;
                    case 3:
                        addMoeda(scanner, cofrinho, euro);
                        break;
                    default:
                        break;
                }
            } else if (primeiroPassso == 2) {
                System.out.println(
                        "Escolha a moeda: \n1 - Real \n2 - Dólar \n3 - Euro \n");
                Integer moedas = scanner.nextInt();

                switch (moedas) {
                    case 1:
                        rmMoeda(scanner, cofrinho, real);
                        break;
                    case 2:
                        rmMoeda(scanner, cofrinho, dolar);
                        break;
                    case 3:
                        rmMoeda(scanner, cofrinho, euro);
                        break;
                    default:
                        break;
                }
            } else if (primeiroPassso == 3) {
                cofrinho.listagemMoedas();
            } else if (primeiroPassso == 4) {
                cofrinho.totalConvertido();
            } else if (primeiroPassso == 0) {
                scanner.close();
                interruptor = false;
            }
        }
    }

    // metodo utilitário com lógica para adicionar moeda para evitar repetição de
    // código
    public static void addMoeda(Scanner scanner, Cofrinho cofrinho, Moeda moeda) {
        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();
        cofrinho.adicionar(moeda, valor);
    }

    // mesma proposta do método acima, porém para remover moeda
    public static void rmMoeda(Scanner scanner, Cofrinho cofrinho, Moeda moeda) {
        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();
        cofrinho.remover(moeda, valor);
    }

}