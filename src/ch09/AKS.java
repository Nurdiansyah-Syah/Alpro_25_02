package ch09;
import java.util.Scanner;

public class AKS { 
 
    static long c[] = new long[100]; 

    static void coef(int n) { 
        c[0] = 1; 
        for (int i = 0; i < n; c[0] = -c[0], i++) { 
            c[1 + i] = 1; 
  
            for (int j = i; j > 0; j--) 
                c[j] = c[j - 1] - c[j]; 
        } 
    } 

    static boolean Prima(int n) { 
 
        coef(n); 
        c[0]++; 
        c[n]--; 

        int i = n; 
        while ((i--) > 0 && c[i] % n == 0); 

        return i < 0; 
    } 

public static void main(String[] args) { 
	Scanner fox = new Scanner(System.in);
        int n;
		
		System.out.println("AKS Primality Test\n");
		System.out.print("Masukkan Angka Yang Ingin Di Cek Kurang Dari 100 = ");
		n = fox.nextInt();
		
		System.out.println(" ");
		
        if (Prima(n)) 
            System.out.println(n+" Bilangan Prima"); 
        else
            System.out.println(n+" Bukan Bilangan Prima"); 
    } 
} 