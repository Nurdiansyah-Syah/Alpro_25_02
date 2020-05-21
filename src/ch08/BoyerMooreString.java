package ch08;
import java.util.Scanner;

public class BoyerMooreString {
    static Scanner fox = new Scanner(System.in);
 
    public static void Shorting(String[] string) {
        for (int i = 0; i < string.length - 1; i++) {
            int min = i;
            for (int elemen = i + 1; elemen < string.length; elemen++) {
                if (string[elemen].compareTo(string[min]) < 0)
                    min = elemen;
            }
            String temp = string[i];
            string[i] = string[min];
            string[min] = temp;
        }
    }
 
    public static void BinarySearch(String[] string) {
        int batasAtas = string.length - 1;
        int batasBawah = 0;
 
        System.out.print("Masukkan string yang dicari = ");
        String cari = fox.next();
		
        boolean notFound = true;
        while (notFound) {
            int posisiSekarang = (batasAtas + batasAtas) / 2;
            if (string[posisiSekarang].equals(cari)) {
                notFound = false;
                System.out.println("Ditemukan " + cari );
            } else if (batasBawah > batasAtas) {
                System.out.println("Tidak ditemukan " + cari);
                break;
            } else {
                if (string[posisiSekarang].compareTo(cari) < 0)
                    batasBawah = posisiSekarang + 1;
                else
                    batasAtas = posisiSekarang - 1;
            }
        }
    }
 
	public static void main(String[] args) {
        String string[];
        System.out.print("Masukkan jumlah string = ");
        string = new String[fox.nextInt()];
        for (int i = 0; i < string.length; i++) {
            System.out.print("Masukkan string ke :" + (i + 1) + " = ");
            string[i] = fox.next();
        }
        Shorting(string);
        BinarySearch(string);
    }
}