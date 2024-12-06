package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

class ContaCorrente extends ContaBanco {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
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
        System.out.println("Conta Corrente - Titular: " + titular + ", Saldo: " + saldo + ", Limite:" + limite);
    }
}
