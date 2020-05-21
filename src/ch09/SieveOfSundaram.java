package ch09;
import java.util.Scanner;
 

public class  SieveOfSundaram{

    private boolean[] calcPrima(int limit){
        int n = limit/2;
        boolean[] prima = new boolean[limit];        
 
        for (int i = 1; i < n; i++)
            for (int j = i; j <= (n - i) / (2 * i + 1); j++)
                prima[i + j + 2 * i * j] = true;
 
        return prima;
    }

    public void getPrima(int N){
        boolean[] prima = calcPrima(N);
        lamp(prima);
    }

    public void lamp(boolean[] prima){
        System.out.print("\nBilangan Prima = 2 3 ");
        for (int i = 2; i < prima.length/2; i++)
            if (!prima[i])
                System.out.print((2 * i + 1) +" ");
        System.out.println();
    }

public static void main (String[] args) {
        Scanner fox = new Scanner(System.in);
        System.out.println("Sieve Of Sundaram\n");

        SieveOfSundaram sos = new  SieveOfSundaram();
		
        System.out.print("Masukkan Angka Untuk Menemukan Bilangan Prima Kurang Dari Angka Tersebut = ");
        int n = fox.nextInt();
        sos.getPrima(n);        
    }
}