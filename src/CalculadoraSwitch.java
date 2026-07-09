import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

          switch (operacao) {
               case '+'-> System.out.println (num1 + num2);
               case '-'-> System.out.println (num1 - num2);
               case '*'-> System.out.println (num1 * num2);
               case '/'-> {
                    if ( num2 != 0)
                        System.out.println (num2 / num1);
                    else 
                        System.out.println (" Não é possível dividir por zero ");
                }
          }

        // --------------------------------------------------

        sc.close();
    }
}
