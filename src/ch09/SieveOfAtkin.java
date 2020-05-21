package ch09;
import java.util.Scanner;

public class  SieveOfAtkin{

    private boolean[] calcPrima(int limit){

        boolean[] prima = new boolean[limit + 1];
        prima[2] = true;
        prima[3] = true;
        int root = (int) Math.ceil(Math.sqrt(limit));
 
        for (int x = 1; x < root; x++){
            for (int y = 1; y < root; y++){
                int n = 4 * x * x + y * y;
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))
                    prima[n] = !prima[n];
                n = 3 * x * x + y * y;
                if (n <= limit && n % 12 == 7)
                    prima[n] = !prima[n];
                n = 3 * x * x - y * y;
                if ((x > y) && (n <= limit) && (n % 12 == 11))
                    prima[n] = !prima[n];
            }
        }

        for (int i = 5; i <= root; i++)
            if (prima[i])
                for (int j = i * i; j < limit; j += i * i)
                    prima[j] = false;
 
        return prima;
    }

    public void getPrima(int N){
        boolean[] prima = calcPrima(N);
        lamp(prima);
    }

    public void lamp(boolean[] prima){
        System.out.print("\nBilangan Prima = ");
        for (int i = 2; i < prima.length; i++)
            if (prima[i])
                System.out.print(i +" ");
        System.out.println();
    }

public static void main (String[] args) {
        Scanner fox = new Scanner(System.in);
        System.out.println("Sieve Of Atkin Prime \n");

        SieveOfAtkin soa = new  SieveOfAtkin();

        System.out.print("Masukkan Angka Untuk Menemukan Bilangan Prima Kurang Dari Angka Tersebut = ");
        int n = fox.nextInt();
        soa.getPrima(n);        
    }
}