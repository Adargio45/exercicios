import java.util.Scanner;

public class Exercício_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para a : ");
        int a = sc.nextInt();
        System.out.println ("Digite um valor para b : ");
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println("PROD : " + prod);

        sc.close();
    }
}
