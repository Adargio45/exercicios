import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor, media = 0;
        int numPos = 0;
        for (int contador = 1; contador <= 6; contador++) {

            valor = teclado.nextFloat();
            if (valor > 0) {
                media = media + valor;
                numPos++;

            }
        }
            System.out.println(numPos +  "Valores positivos");
            System.out.printf ("%.1f\n", (media/numPos));


            teclado.close();
        }
    }
