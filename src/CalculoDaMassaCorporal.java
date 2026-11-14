import java.util.Scanner;

public class CalculoDaMassaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        double peso;
        double altura;

        System.out.print("Digite o valor do peso kg: ");
        peso= sc.nextDouble();

        System.out.print("Digite o valor da altuta m: ");
        altura= sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc<18.5) {
            System.out.println("Abaixo do peso:");

        } else if ( imc<=24.9) {

            System.out.println("Peso normal:");

        } else if  ( imc <30) {
            System.out.println("Sobrepeso:");

        } else {
            System.out.println("Obesidade");
        }

        System.out.printf ("Seu IMC e: %.2f%n", imc);

        sc.close();


    }

}
