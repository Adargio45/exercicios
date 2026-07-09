import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        float b;
        double c;
        System.out.println("Digite um numero inteiro: ");
        a = teclado.nextInt();
        System.out.println("Voce digitou um numero inteiro: " + a);
        System.out.println("Digite um numero float: " );
        b = teclado.nextFloat();
        System.out.println("Voce digitou um numero float: " + b);
        System.out.println("Digite um numero double: ");
        c = teclado.nextDouble();
        System.out.println("Voce digitou um numero double: " + c);

        String nome;
        teclado.nextLine();
        //int codigo;
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Olá , " + nome);



        teclado.close();



    }
}
