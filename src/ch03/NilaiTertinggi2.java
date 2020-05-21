package ch03;
import java.util.Scanner;

public class NilaiTertinggi2 {
    public static void main(String[] args){
        Scanner fox = new Scanner(System.in);
        
        int x,y,z;
        
        System.out.print("Masukkan Nilai x = ");
        x = fox.nextInt();
        System.out.print("Masukkan Nilai y = ");
        y = fox.nextInt();
        System.out.print("Masukkan Nilai z = ");
        z = fox.nextInt();
        
        if (x > y && x > z){
            System.out.println("x Nilai Tertiggi");
        }else if (y > x && y > z){
            System.out.println("y Nilai Tertinggi");
        }else if (z > x && z > y){
            System.out.println("z Nilai Tertinggi");
        }else {
            System.out.println("Tidak Terdevenisi");
        }
    }
}