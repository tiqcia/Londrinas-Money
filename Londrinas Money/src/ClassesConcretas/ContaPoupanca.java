package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

public class ContaPoupanca extends ContaBanco {
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(String numeroConta, double saldo){
        super(numeroConta, saldo);
    }

    public void juros(){
        saldo += saldo * RENDIMENTO;
    }

    @Override
    public void mostrarConta(){
        System.out.println("Conta Poupança - Número da Conta: " + numeroConta + ", Saldo: " + saldo);
    }
}
