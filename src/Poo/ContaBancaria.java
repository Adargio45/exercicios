package Poo;
// classe, os atributos e os comportamentos
public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;
    public double saldo (){
        return this.saldo;
    }
    public void depositar (double valor){
        if ( valor > 0){
            this.saldo += valor;
        }

    }
    public void sacar (double valor){
        if ( valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
        }
    }

}
