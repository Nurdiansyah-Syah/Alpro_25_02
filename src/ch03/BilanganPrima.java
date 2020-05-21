package ch03;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
    Scanner rar = new Scanner(System.in);
    
    int x,i,fox;
    
        System.out.print("Masukkan Angka = ");
        x = rar.nextInt();
        
        boolean prima = true;
                
        for (i=2;i<=x/2;i++){
        fox = x % i;
            if (fox == 0){
            prima = false;
            break;
            }
        }
        if (prima && ((x > 0) && (x != 1))){
            System.out.print(x + " = Bilangan Prima");
        }else {
            System.out.print(x + " = Bukan Bilangan Prima");
        }
    }
}