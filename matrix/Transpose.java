
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        
        
        // In-place Transpose only for square matrix	
		// swap upper-triangular and lower-triangular
 		for (int i = 0; i < matrix.length; i++) {
             for (int j = i+1; j < matrix[0].length; j++) {               
                  int temp=matrix[i][j];     
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;              
             }
         }

        
        // for any matrix
        // by creating new array
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] transpose = new int[col][row];
     	for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {               
                    transpose[i][j]=matrix[j][i];          
            }
        }

        // printing array
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) { 
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
