import java.util.*;
import java.lang.*;
import java.io.*;

public class RotCCW90
{
    public void swapQuad(int[][] matrix, int i, int j,int n){
        
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n-j-1][i];
        matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
         matrix[j][n-i-1] = temp;
        
        
    }
    
    
    public void rotateCW(int[][] matrix) {
        int n = matrix.length;
       
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-i-1; j++){
                swapQuad(matrix,i,j,n);
            }
        }
        
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();	
	  int m = sc.nextInt();
	  int[][] matrix=new int[n][m];
	  
	 
      for(int i=0; i<n; i++){
		  for(int j=0; j<n; j++){
			   matrix[i][j]=sc.nextInt();
		  }
	  }
	  rotateCW(matrix, n,m);
	 
	 
      for(int i=0; i<n; i++){
		  for(int j=0; j<m; j++){
			   System.out.print(matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  }
}
