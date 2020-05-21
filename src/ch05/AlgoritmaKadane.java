package ch05;
import java.util.*;

public class AlgoritmaKadane {
  public static void main(String[] args) {
	Scanner fox = new Scanner(System.in);
	
    int maksimum, jumlah, a, lokasi = 0, array[];
    
    System.out.print("Masukkan Jumlah Urutan: ");
    jumlah = fox.nextInt();
	
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" Angka = ");
    for(a = 0; a < jumlah; a++) {
      System.out.print("Urutan ke-"+ (a+1) +": " );
      array[a] = fox.nextInt();
    }
    maksimum = array[0];
    for(a = 0; a < jumlah; a++) {
      if (array[a] > maksimum){
        maksimum = array[a];
        lokasi = a+1;
      }
    }
    System.out.println("Nilai Makasimum Adalah "+maksimum+" Berada di Urutan Ke "+lokasi);
    
  }
}