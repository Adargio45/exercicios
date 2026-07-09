import java.util.Scanner;

public class ExerciciosDeAprendizados {
    public static void main(String[] args) {
        Scanner prod= new Scanner(System.in);
        int a = prod.nextInt();
        int b = prod.nextInt();
        int c = prod.nextInt();
        int d = prod.nextInt();
        int diferença= (( a * b ) - ( c * d));
        System.out.println("DIFERENÇA = " + diferença);

        prod.close();
    }
}
