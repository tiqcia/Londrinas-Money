package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

public class ContaPoupanca extends ContaBanco {
    private static final double RENDIMENTO = 0.005; // 0.5% de rendimento

    public ContaPoupanca(String titular, String numeroConta) {
        super(titular, numeroConta);
    }

    public void aplicarRendimento() {
        double rendimento = SALDO * RENDIMENTO;
        SALDO += rendimento;
        System.out.printf("Rendimento aplicado: R$%.2f. Novo saldo: R$%.2f%n", rendimento, SALDO);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor deve ser maior que zero.");
            return false;
        }

        if (valor > LIMITE) {
            System.out.println("Limite excedido! Tente novamente.");
            return false;
        }

        if (SALDO >= valor) {
            SALDO -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso! Novo saldo: R$%.2f%n", valor, SALDO);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public void mostrarConta() {
        System.out.println("# Conta Poupança #");
        System.out.println("| [Número da Conta] " + numeroConta);
        System.out.println("| [Titular] " + titular);
        System.out.println("| [Saldo] R$" + SALDO);
        System.out.println("| [Limite] R$" + LIMITE);
    }
}
