package ClassesAbstratas;

public abstract class ContaBanco {
    protected String numeroConta;
    protected double saldo;

    public ContaBanco(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public abstract void mostrarConta();
}
