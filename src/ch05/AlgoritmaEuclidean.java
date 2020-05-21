package ch05;
import java.util.Scanner;
 
public class AlgoritmaEuclidean {
	public static void main(String[] args) {
	Scanner fox = new Scanner(System.in);
	
	int x, y, r;
 
	System.out.print("Masukkan Angka x : ");
	x = fox.nextInt();
	

	System.out.print("Masukkan Angka y : ");
	y = fox.nextInt();
	System.out.println();
 
	r = x % y;
 
	while (r != 0) {
		x = y;
		y = r;
		r = x % y;
	}
	System.out.println("FPB = "+y);
	}
}