import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* Aqui foi declarada très variáveis:
        número = guarda o número digitado;
        resultado = guarda o cálculo;
        contador = controla o while */
        
        int numero, resultado, contador;
        System.out.println(" Digite um valor: ");
        numero = teclado.nextInt();

        contador = 1;
        while (contador <= 10){
            resultado = numero * contador;
            System.out.println( numero + " x " + contador + " = " + resultado);
            contador++;


        }
        teclado.close();


    }
}
