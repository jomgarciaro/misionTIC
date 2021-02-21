package reto1;

import java.util.Scanner;

public class Reto1 {

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = "I am ";
        
        
        for (int i = 1; i < n; i++) {
            
            s += "that ";
            
            if (i%2 == 0) {
                s += "I am ";
            } else {
                s += "I groot ";
            }
        }
        
        s += "it";
         
        System.out.println(s);
    }
    
}
