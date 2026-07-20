import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um valor: ");
        numero = teclado.nextInt();
        // Aqui tambem pode ser assim:
        // for ( int contador = 1 ; contador <= 10 ; contador = contador +1
        for ( int i = 1 ; i <= numero ; i++) {
            System.out.println (" Numero :" + i);
            /* Para melhor entendimento em vez de usar uma letra como o "i ",
            usa nomes:
            for (contador = 0 ; contador <= numero ; contador ++);
            System.out.println ( "Numero: " + contador);
             */


        }
        teclado.close();
    }
}
