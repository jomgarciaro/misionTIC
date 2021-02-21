package sesion3;

import java.util.Scanner;

public class Sesion3 {
    
    public static double cuadrado(double x) {
        return x*x;
    }
  

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double m = sc.nextDouble();
        
        int count = 1;
        
        while (n > m) {
            n *= 1.02;
            m *= 1.03;
            count++;
        }
        
        System.out.println(count);
    }
    
}
