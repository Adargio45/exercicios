import java.util.Scanner;

public class CalculandoQuadradoNumero {
    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);


        System.out.println("Digite um numero: ");
        Integer numero =scanner.nextInt();

        Integer quadrado= numero * numero;


        System.out.println("O quadrado de " + numero + " e " + quadrado + ".");

        scanner.close();

    }

}
