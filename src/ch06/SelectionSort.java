package ch06;

public class SelectionSort{
	public static void main(String[] args){
		
		int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		int a,b,max,fox;
		
		System.out.print("Urutan Dari Yang Terkecil = ");
		for (a = 0; a < angka.length - 1; a++){
			max = a;
			for (b = a; b < angka.length; b++){
				if (angka[b] < angka.length){
					max = b;
				}
			}
			fox = angka[a];
			angka[a] = angka[max];
			angka[max] = fox;
		}
		for (a = 0; a < angka.length; a++){
			if (a < angka.length - 1){
				System.out.print(angka[a]+",");
			} else {
				System.out.print(angka[a]);
			}
		}
	}
}