package ch06;

public class InsertionSort {
	public static void main(String[] args) {
	
		int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int x,y,fox;
		
		System.out.print("Urutan Dari Yang Terkecil = ");
		for (x = 1; x < angka.length; x++){
			for (y = x; y>= 1; y--){
				if(angka[y] > angka[y-1]){
					break;
				}
				fox = angka[y];
				angka[y] = angka[y-1];
				angka[y-1] = fox;
			}
		}
		for (x = 0; x < angka.length; x++){
			if (x < angka.length - 1){
				System.out.print(angka[x]+ ",");
			}else {
			System.out.print(angka[x]);
			}
		}
	}
}