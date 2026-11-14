package Poo;
// Leia-se: Definição do tipo de dado "carro"
public class Carro {
    // Características
    String marca;
    String modelo;
    int ano;
    String cor;
    int km;
    double preco;

    // criar um "botão" para que eu possa executar algo ( mostrar os dados)
     void exibirAnuncio(){
         System.out.println("Anuncio do carro" );
         System.out.println(marca+"-"+modelo+"("+ano+")");
         System.out.println("cor: "+cor+"  Km: "+km+"  R$ "+preco);



     }
}
