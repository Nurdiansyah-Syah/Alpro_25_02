package ch02;

public class ObjekTrapesium {
	public static void main(String[] args) {
		Trapesium trapesium = new Trapesium();
		trapesium.alasBawah = 25;
		trapesium.alasAtas = 15;
		trapesium.tinggi = 12;
		System.out.println("Luas = "+ trapesium.luas());
	}
}