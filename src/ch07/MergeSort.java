package ch07;

public class MergeSort {

	public static void main(String[] args){

     int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	 int i;
     System.out.println("Angka Acak = {82,12,41,38,19,26,9,48,20,55,8,32,3}");
 
     initialize(angka,0,angka.length-1);
     System.out.print("Setelah di Urutkan merge sort = ");
     for(i = 0; i < angka.length; i++)
     {
        System.out.print(angka[i]+" ");
     }

}
	public static void initialize(int angka[],int l,int h){ 
     int low = l;
     int high = h;
     if (low >= high){
        return;
     }
     int middle = (low+high)/2;
     initialize(angka,low,middle);
     initialize(angka,middle+1,high);
     int end_low = middle;
     int start_high = middle+1;
     while ((l <= end_low) && (start_high <= high)){
        if (angka[low] < angka[start_high]){
           low++;
        }
        else{
           int fox = angka[start_high];
           for (int k = start_high-1;k>=low;k--)
           {
              angka[k+1] = angka[k];
           }
           angka[low] = fox;
           low++;
           end_low++;
           start_high++;
		}
    }
  }  
} 