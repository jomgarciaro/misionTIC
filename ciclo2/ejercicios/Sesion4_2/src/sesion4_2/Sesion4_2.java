package sesion4_2;

import java.util.Scanner;
public class Sesion4_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número");
        int n = sc.nextInt();
        System.out.println(n); 
        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            String dire = sc1.nextLine();
            String splitDir[];
            //splitDir = new String[3];
            splitDir = dire.split("a");
            String university;
            university = splitDir[1];
            System.out.println(university);
        }
    }
    
}
