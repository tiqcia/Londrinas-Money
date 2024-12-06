package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

class ContaCorrente extends ContaBanco {
    private double limite;

    public ContaCorrente(String numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void mostrarConta(){
        System.out.println("Conta Corrente - Número da Conta: " + numeroConta + ", Saldo: " + saldo + ", Limite:" + limite);
    }
}
