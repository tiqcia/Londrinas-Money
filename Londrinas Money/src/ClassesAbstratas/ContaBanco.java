package ClassesAbstratas;

public abstract class ContaBanco {
    protected String titular;
    protected String numeroConta;
    protected double SALDO = 2000.00;
    protected double LIMITE = 500.00;

    public ContaBanco(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        SALDO += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso. Novo saldo: R$%.2f%n", valor, SALDO);
    }

    public abstract boolean sacar(double valor);

    public abstract void mostrarConta();
}
