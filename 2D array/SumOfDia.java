

import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfDia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        
        int sum1 = 0, sum2=0, sum3=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ) {      // left to right diagonal
                    sum1 += matrix[i][j];
                }
                if(i + j == n - 1){    // right to left diagonal
                    sum2 += matrix[i][j];
                }
                if(i == j || i + j == n - 1){   // SUM OF BOTH DIAGONAL
                    sum3 += matrix[i][j];
                }
            }

        }
         System.out.println(sum1);
         System.out.println(sum2);
         System.out.println(sum3);

    }
}
