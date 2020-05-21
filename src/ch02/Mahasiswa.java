package ch02;

public class Mahasiswa {
	String nim;
	String nama;
	String alamat;
	String hp;
	
	public String getnim() {
		return nim;
	}
	
	public String getnama() {
		return nama;
	}
	
	public String getalamat() {
		return alamat;
	}
	
	public String getHp() {
		return hp;
	} 
	
	public void cetak() {
		System.out.println("NIM : " + nim);
		System.out.println("NAMA : " + nama);
		System.out.println("ALAMAT: " + alamat);
		System.out.println("HP : " + hp);
	}
}