import java.util.*;
import java.lang.*;
import java.io.*;

public class spiral
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
       Scanner sc = new Scanner(System.in);
	  int r = sc.nextInt();	
       int c = sc.nextInt();	
	  int[][] matrix=new int[r][c];
      for(int i=0; i<r; i++){
		  for(int j=0; j<c; j++){
			   matrix[i][j]=sc.nextInt();
		  }
	  }
       int top=0,left=0, right=c-1, down=r-1, dir=0;
      while(left<=right && top<=down){
        if(dir==0){
          for(int i=left; i<=right; i++){
            System.out.print(matrix[top][i]+" ");
          }
          top++;
        }else if(dir==1){
          for(int i=top; i<=down; i++){
            System.out.print(matrix[i][right]+" ");
          }
          right--;
        }
        else if(dir==2){
          for(int i=right; i>=left; i--){
            System.out.print(matrix[down][i]+" ");
          }
          down--;
        }
        else if(dir==3){
          for(int i=down; i>=top; i--){
            System.out.print(matrix[i][left]+" ");
          }
          left++;
        }
        dir=(dir+1)%4;
      }
	}
}