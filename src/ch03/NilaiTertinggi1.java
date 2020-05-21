package ch03;
import java.util.Scanner;

public class NilaiTertinggi1 {
        public static void main(String[] args) {
        Scanner fox = new Scanner(System.in);
        
        int x,y;
        
            System.out.print("Masukkan nilai x = ");
            x = fox.nextInt();
            
            System.out.print("Masukkan Nilai y = ");
            y = fox.nextInt();
            
            if (x > y){
                System.out.println("x Nilai Tertinggi");
            } else {
                System.out.println("y Nilai Tertinggi");
            }
    }
}