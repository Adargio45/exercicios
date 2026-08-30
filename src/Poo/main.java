package Poo;

public class main {
    public static void main(String[] args) {
        ContaBancaria conta  = new ContaBancaria();
        conta.depositar( 500);
        System.out.println (conta.saldo());

    }
}
