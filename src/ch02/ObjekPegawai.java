package ch02;

public class ObjekPegawai {
	public static void main(String[] args) {
		Pegawai pgw1 = new Pegawai();
		Pegawai pgw2 = new Pegawai();
		
		pgw1.nik = "123";
		pgw1.nama = "Budi";
		pgw1.jabatan = "Staf";
		pgw1.isAktif = true;
		
		pgw2.nik = "123";
		pgw2.nama = "Cici";
		pgw2.jabatan = "Administrasi";
		pgw2.isAktif = true;
		
		pgw1.cetak();
		System.out.println("==================");
		pgw2.cetak();
	}
}