package Poo;

import java.util.Scanner;

public class UaiBiMotors {
    public static void main(String[] args) {
        Carro c1, c2;

        c1 = new Carro();
        c2 = new Carro();

        c1.marca= "Porsche";
        c1.modelo= "Cayenne";
        c1.ano= 2022;
        c1.km= 0;
        c1.cor= "Branco";
        c1.preco= 2200000;

        c2.marca = "Chevrolete";
        c2.modelo= "corsa";
        c2.ano= 1998;
        c2.km= 25000;
        c2.cor= "Cinza";
        c2.preco= 8000;


        c1.exibirAnuncio();
        c2.exibirAnuncio();

    }
}
