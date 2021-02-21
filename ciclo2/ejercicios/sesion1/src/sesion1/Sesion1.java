package sesion1;

import java.util.Scanner;

public class Sesion1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int days = sc.nextInt();
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        
        System.out.println(years + " año(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " día(s)");
        
    }
    
}
