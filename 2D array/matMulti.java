import java.util.*;

public class matMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // first matrix
        int r1 = sc.nextInt(); 
		int c1 = sc.nextInt();		     
        int[][] A = new int[r1][c1];		
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
		// second matrix
		int r2 = sc.nextInt();
		int c2 = sc.nextInt(); 
		int[][] B = new int[r2][c2];   		
		for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
		
        // for matrix multiplication // (r1*c1) * (r2*c2) = (r1*c2) 
        if (c1 != r2) {   
            System.out.println("c1 should equal to r2");          
        }
        else {      // c1==r2           
            mulMat(A, B, r1,c1,r2,c2);
        }
	}
     
   
  
    // multiplication of two square matrix
    public static void mulMat(int[][] A, int[][] B, int r1,int c1,int r2,int c2){
        int[][] ans = new int[r1][c2];  
 
        for (int i = 0; i < r1; i++) {      
            for (int j = 0; j < c2; j++) {				
                   for(int k=0; k<c1; k++)
                       ans[i][j]+= A[i][k] * B[k][j];                  
                                 
            }           
        }

        for (int i = 0; i < r1; i++) {      
            for (int j = 0; j < c2; j++) 
                System.out.print(ans[i][j]+" ");            
            System.out.println();
        }
    }
    
        	
    
}
