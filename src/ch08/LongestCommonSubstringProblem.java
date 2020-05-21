package ch08;

public class LongestCommonSubstringProblem { 

    static int LCSProblem(char X[], char Y[], int m, int n)  { 

        int LCSProblem[][] = new int[m + 1][n + 1]; 
        int result = 0;  
		
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++)  { 
                if (i == 0 || j == 0) 
                    LCSProblem[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]) { 
                    LCSProblem[i][j] = LCSProblem[i - 1][j - 1] + 1; 
                    result = Integer.max(result, LCSProblem[i][j]); 
                }  
                else
                    LCSProblem[i][j] = 0; 
            } 
        } 
        return result; 
    } 
      
    public static void main(String[] args)  
    { 
        String X = "NURDIANSYAH"; 
        String Y = "NURZAKIAH"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Panjang Longest Common Substring Adalah = " + LCSProblem(X.toCharArray(), Y.toCharArray(), m, n)); 
    } 
} 