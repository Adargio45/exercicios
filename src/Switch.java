import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Digite um valor: ");
        int valor = teclado.nextInt();
        // operador seta -> (arrow operator)
            switch (valor) {
                case 1 -> System.out.println("Você digitou 1");
                case 2 -> System.out.println("Você digitou 2");
                case 3 -> System.out.println("Você digitou 3");
                default -> System.out.println("Valor inválido.");
            }
        }
    }
