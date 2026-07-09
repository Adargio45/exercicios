import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       System.out.println("Digite um valor:");
        int valor = teclado.nextInt();
        // Existe outra forma e mais simples de usar o switch case com o operador seta -> (arrow operator) :
        // switch (valor) {
        //    case 1 -> System.out.println("Você digitou 1");
        //    case 2 -> System.out.println("Você digitou 2");
        //    case 3 -> System.out.println("Você digitou 3");
        //    default -> System.out.println("Valor inválido.");
        //}

        switch (valor){
            // aqui é colocado dois pontos, não ponto e  vígula
            case 1:
                System.out.println("Voce digitou  1:");
                // Já aqui é colocado o ponto e vírgula.
                break;
            case 2:
                System.out.println("Voce digitou 2");
                break;
            case 3:
                System.out.println("Voce digitou 3:");
                break;

            default:
                System.out.println("Valor inválido!");
        }

        teclado.close();

    }
}
