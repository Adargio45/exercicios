import java.util.Scanner;

public class Exercicio_1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b,c,media;
        // Entrada de dados

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        //Processamento de dados
        media =( a * 2 + b * 3 + c * 5)/ 10;

        // Saida de dados
        System.out.printf( "MEDIA = %.1f\n",  media);


        teclado.close();
    }
}
