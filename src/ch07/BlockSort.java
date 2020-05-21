package ch07;

public class BlockSort {

    static void BlockSort (int angka[], int so, int bg){

        int i = so, j = bg, fox;
        int pivot = angka[so];

        do{
            while (angka[i] < pivot) i++;
            while (angka[j] > pivot) j--;
            if (i <= j)
            {
                fox = angka[i]; 
				angka[i] = angka[j];
				angka[j] = fox;
                i++; j--;
            }
        } while (i <= j);

        if (so < j) BlockSort (angka, so, j);
        if (i < bg) BlockSort (angka, i, bg);
    }
    public static void main(String[] args) {
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int i,n = 13;
		
        System.out.println("Angka Acak = {82,12,41,38,19,26,9,48,20,55,8,32,3}");
		
        BlockSort(angka,0,n-1);
                System.out.print("Angka Telah Diurutkan = ");

        for(i = 0;i < angka.length;i++){
			if (i < angka.length - 1){
            System.out.print(angka[i]+" , ");
			} else {
				System.out.print(angka[i]);
			}
        }

    }

}