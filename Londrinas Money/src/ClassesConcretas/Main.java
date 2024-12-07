package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta;

        int tipoConta;

        do {
            System.out.println("\n Seja bem-vindo(a) \n");
            System.out.println(" Selecione o seu tipo de conta ");
            System.out.print("|=============================|\n");
            System.out.println("| [1] - Para Conta Corrente   |");
            System.out.println("| [2] - Para Conta Poupança   |");
            System.out.print("|=============================|\n");
            tipoConta = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            if (tipoConta != 1 && tipoConta != 2) {
                System.out.println("Opção Inválida! Tente novamente.");
            }
        } while (tipoConta != 1 && tipoConta != 2);

        System.out.print("Digite seu nome: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        String numeroConta = scanner.nextLine();

        if (tipoConta == 1) {
            conta = new ContaCorrente(titular, numeroConta);
        } else {
            conta = new ContaPoupanca(titular, numeroConta);
        }

        int opcao;
        do {
            System.out.println("\n  O que você deseja fazer? ");
            System.out.print("|==========================|\n");
            System.out.println("| [1] Sacar                |");
            System.out.println("| [2] Depositar            |");
            System.out.println("| [3] Mostrar Conta        |");

            if (conta instanceof ContaPoupanca) {
                System.out.println("| [4] Aplicar Rendimento   |");
            }
            System.out.println("| [0] Sair                 |");
            System.out.println("|==========================|\n");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    conta.mostrarConta();
                    break;

                case 4:
                    if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).aplicarRendimento();
                    } else {
                        System.out.println("Opção inválida para este tipo de conta.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sua sessão...");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
