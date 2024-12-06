package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

public class ContaPoupanca extends ContaBanco {
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    public void juros(){
        saldo += saldo * RENDIMENTO;
    }

    @Override
    public void mostrarConta(){
        System.out.println("Conta Poupança - Titular: " + titular + ", Saldo: " + saldo);
    }
}
