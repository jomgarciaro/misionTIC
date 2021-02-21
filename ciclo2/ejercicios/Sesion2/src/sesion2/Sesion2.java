package sesion2;
import java.util.Scanner;

public class Sesion2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceptados");
        } else {
            System.out.println("Valores no aceptados");
        }
    }
    
}
