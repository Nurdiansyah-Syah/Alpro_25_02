package ch03;
import java.util.Scanner;

public class PembagiTerkecil {
    public static void main(String[] arga){
    Scanner fox = new Scanner(System.in);
    
    int a,b,c,q;
    
        System.out.print("Masukkan Angka = ");
        a = fox.nextInt();
        
        System.out.print("Masukkan Angka Pembagi = ");
        b = fox.nextInt();
        
        c = a/b;
        if (b > 2) {
			System.out.print(b + " Termasuk Pembagi Terkecil Selain 1 dan 2 = " + c);
		} else {
			System.out.print(b + " Tidak Termasuk Pembagi Terkecil Selain 1 dan 2 = " + c);
		}
    }
}