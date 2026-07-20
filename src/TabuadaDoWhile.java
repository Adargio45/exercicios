import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,resultado, contador;
        System.out.println("Digite um valor: ");
        numero = teclado.nextInt();

        contador = 1;
        do {
            resultado = numero * contador;
            System.out.println( numero + " x " + contador + " = " + resultado);
            contador++; // ou contador = contador +1;

        } while (contador <= 10);





        teclado.close();
    }
}
