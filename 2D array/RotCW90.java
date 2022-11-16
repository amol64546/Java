import java.util.*;

public class RotCW90
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        // Rotation clockwise 90

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
        
        // Taking inputs
		for(int i=0; i<r;i++){
			for(int j=0; j<c; j++){
				arr[i][j] = sc.nextInt();
			}
		}
	
     // Transpose
		for(int i=0; i<r;i++){			
			for(int j=i+1; j<c; j++){
			    	int temp=arr[i][j];
                     arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
			}
		
		}	

    // swap cols	  
 for(int i=0; i<r;i++){           // row fix
    for(int j=0; j<c/2; j++){    // col upto half
        int temp=arr[i][c-1-j];
        arr[i][c-1-j]=arr[i][j];
         arr[i][j]=temp;
     }
}





     // Printing
		for(int i=0; i<r;i++){
			for(int j=0; j<c; j++){
				System.out.print(arr[i][j] +" ");
			}
            System.out.println();
		}
	}
}
