import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Digite a quantidade passada pelo cliente : ");
        double valorPassadoPeloCliente = sc.nextDouble();

        double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println ("Troco: " + resultado);

        sc.close();

    }
}
