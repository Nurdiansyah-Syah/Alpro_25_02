package ch07;

public class CocktailShakerSort { 
	
    void cocktail(int angka[]) { 
        boolean swap = true; 
        int start = 0; 
        int end = angka.length; 
  
        while (swap == true) { 
            swap = false; 
            for (int i = start; i < end - 1; ++i) { 
                if (angka[i] > angka[i + 1]) { 
                    int fox = angka[i]; 
                    angka[i] = angka[i + 1]; 
                    angka[i + 1] = fox; 
                    swap = true; 
                } 
            } 
 
            if (swap == false) 
                break; 
 
            swap = false; 

            end = end - 1; 

            for (int i = end - 1; i >= start; i--) { 
                if (angka[i] > angka[i + 1]) { 
                    int fox = angka[i]; 
                    angka[i] = angka[i + 1]; 
                    angka[i + 1] = fox; 
                    swap = true; 
                } 
            } 

            start = start + 1; 
        } 
    } 
  
    void printArray(int angka[]) { 
        int n = angka.length; 
        for (int i = 0; i < n; i++) 
            System.out.print(angka[i] + " "); 
        System.out.println(); 
    } 
   
    public static void main(String[] args) { 
        CocktailShakerSort as = new CocktailShakerSort(); 
        int angka[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
        as.cocktail(angka); 
		System.out.println("Angka Acak = {82,12,41,38,19,26,9,48,20,55,8,32,3}");
        System.out.print("Angka Telah Diurutkan = "); 
        as.printArray(angka); 
    } 
} 