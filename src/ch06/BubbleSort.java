package ch06;

public class BubbleSort {
    public static void main(String[] args) {

        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int m,n,baru;
		
		System.out.print("Urutan Dari Yang Terkecil = ");
        for (m = 0; m < angka.length; m++) {
            for (n = 0; n < angka.length-1; n++) {
                boolean Urutan = angka[n] < angka[n+1];
                if (!Urutan) {
                    baru = angka[n];
                    angka[n] = angka[n+1];
                    angka[n+1] = baru;
                }
            }
        }

        for (m = 0; m < angka.length; m++) {
			if (m < angka.length -1){
				System.out.print(angka[m]+",");
			}else {
				System.out.print(angka[m]);
			}
			
        }

    }
}
