package ClassesConcretas;

import ClassesAbstratas.ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("Jorge", 2000);
        ContaCorrente cc = new ContaCorrente("Cleiton", 500, 400);


    cp.depositar(200);
    cp.juros();
    cp.mostrarConta();

    cc.depositar(200);
    cc.sacar(50);
    cc.mostrarConta();
    }
}