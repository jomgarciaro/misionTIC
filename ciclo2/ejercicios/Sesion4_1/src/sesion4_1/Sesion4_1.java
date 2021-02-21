/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4_1;

import java.util.Scanner;

public class Sesion4_1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        
        if (sum == 0) {
            System.out.println("FACIL");
        } else {
            System.out.println("DIFICIL");
        }
    }
    
}
