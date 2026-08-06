import java.util.Scanner;
public class BEE1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x;
         double y;
         x=sc.nextInt();
         y=sc.nextDouble();
        double valor = x / y;
        System.out.printf("%.3f km/l \n", + valor);



        sc.close();
    }
}
