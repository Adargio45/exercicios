import java.util.Scanner;

public class IncrementoComFor {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
         int a = 3;
         // Quando é para incrementar primeiro usa-se ++a
        // Quando é para incrementar depois usa-se a++
         System.out.println( "Valor de a : " + ++a);
         System.out.println( "Valor de a : " + a);


         teclado.close();
    }

}
