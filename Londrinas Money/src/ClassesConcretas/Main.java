package ClassesConcretas;

import java.util.Scanner;
import ClassesAbstratas.ContaBanco;

public class Main {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.println("[1] Conta Poupança");
            System.out.println("[2] Conta Corrente");
            System.out.println("[0] Sair");

        int opcao = menu.nextInt();
        if (opcao == 0){
            System.out.println("Saindo...");
            menu.close();
        }

        switch (opcao){
            case 1:
                System.out.print("Conta Poupança\n");
                break;

            case 2:
                System.out.print("Conta Corrente\n");
                break;
            }
        }
    }
}
































        //ContaPoupanca cp = new ContaPoupanca("0001", 2000);
        //ContaCorrente cc = new ContaCorrente("0002", 500, 400);


    //cp.depositar(200);
    //cp.juros();
    //cp.mostrarConta();

    //cc.depositar(200);
    //cc.sacar(50);
    //cc.mostrarConta();
