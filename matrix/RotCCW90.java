import java.util.*;
import java.lang.*;
import java.io.*;

public class RotCCW90
{
    public static int[][] function(int[][] matrix, int n, int m){
      
        // transpose
       for(int i=0; i<n; i++){
		  for(int j=i+1; j<m; j++){
		       int k = matrix[i][j];
			   matrix[i][j]=matrix[j][i];
			   matrix[j][i]=k;
		  }
	   }
	   
	   // swap rows
	   for(int c=0; c<m; c++){                   // col fix
		  for(int r=0; r<n/2; r++){              // row upto half
		       int temp = matrix[r][c];
			   matrix[r][c]=matrix[n-1-r][c];
			   matrix[n-1-r][c]=temp;
		  }
	   }

	   
	  
    return matrix;
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
	  function(matrix, n,m);
	 
	 
      for(int i=0; i<n; i++){
		  for(int j=0; j<m; j++){
			   System.out.print(matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  }
}
